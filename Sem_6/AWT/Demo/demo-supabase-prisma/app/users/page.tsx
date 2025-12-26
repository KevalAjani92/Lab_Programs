import { prisma } from "@/lib/prisma";
import { Product, User } from "../generated/prisma/browser";

export default async function UsersPage() {
  const users = await prisma.product.findMany();

  return (
    <div>
      <h1>Users</h1>
      <ul>
        {users.map((user: Product) => (
          <li key={user.id}>
            {user.ProductName} - {user.ProductPrice} - {user.SKU} - {user.Stock}{" "}
            - {user.createdAt.toDateString()}
          </li>
        ))}
      </ul>
    </div>
  );
}
