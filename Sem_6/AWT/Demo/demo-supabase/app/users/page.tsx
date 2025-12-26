import { prisma } from "@/lib/prisma";

export default async function UsersPage() {
  const users = await prisma.user.findMany();

  return (
    <div>
      <h1>Users</h1>
      <ul>
        {users.map(user  => (
          <li key={user.id}>
            {user.email} - {user.password} - {user.createdAt.toDateString()}
          </li>
        ))}
      </ul>
    </div>
  );
}
