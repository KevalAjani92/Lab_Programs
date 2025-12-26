import Link from "next/link";
import { prisma } from "@/lib/prisma";

export default async function UsersPage() {
  const users = await prisma.user.findMany();

  return (
    <div className="min-h-screen p-8 bg-gray-100">
      <h1 className="text-3xl font-bold mb-6 text-center">All Users</h1>

      <div className="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 gap-6">
        {users.map((user) => (
          <Link key={user.UserID} href={`/users/${user.UserID}`}>
            <div className="bg-white rounded-xl shadow-md p-6 cursor-pointer
                            transform transition duration-300 hover:scale-105 hover:shadow-xl">
              <h2 className="text-xl font-semibold">{user.UserName}</h2>
              <p className="text-gray-500 mt-2">User ID: {user.UserID}</p>
              <p className="text-sm text-gray-400 mt-1">
                Joined: {new Date(user.createdAt).toDateString()}
              </p>
            </div>
          </Link>
        ))}
      </div>
    </div>
  );
}
