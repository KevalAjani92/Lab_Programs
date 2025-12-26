import { prisma } from "@/lib/prisma";
import { notFound } from "next/navigation";

interface Props {
  params: {
    id: string;
  };
}

export default async function UserDetailPage({ params }: Props) {
    const { id } = await params;
  const userId = Number(id);

  const user = await prisma.user.findUnique({
    where: { UserID: userId },
    include: {
      tasks: true,
    },
  });

  if (!user) return notFound();

  return (
    <div className="min-h-screen p-8 bg-gray-100">
      <div className="max-w-2xl mx-auto bg-white rounded-xl shadow-lg p-6">
        <h1 className="text-3xl font-bold mb-2">{user.UserName}</h1>
        <p className="text-gray-500 mb-4">User ID: {user.UserID}</p>
        <p className="text-sm text-gray-400 mb-6">
          Created At: {new Date(user.createdAt).toDateString()}
        </p>

        <h2 className="text-xl font-semibold mb-3">Tasks</h2>

        {user.tasks.length === 0 ? (
          <p className="text-gray-500">No tasks assigned.</p>
        ) : (
          <ul className="space-y-3">
            {user.tasks.map((task) => (
              <li
                key={task.TaskID}
                className="border p-4 rounded-lg flex justify-between items-center"
              >
                <div>
                  <p className="font-medium">{task.TaskTitle}</p>
                  <p className="text-sm text-gray-500">
                    {task.TaskDescription}
                  </p>
                </div>

                <span
                  className={`text-sm px-3 py-1 rounded-full ${
                    task.IsCompleted
                      ? "bg-green-100 text-green-700"
                      : "bg-yellow-100 text-yellow-700"
                  }`}
                >
                  {task.IsCompleted ? "Completed" : "Pending"}
                </span>
              </li>
            ))}
          </ul>
        )}
      </div>
    </div>
  );
}
