"use client";

import Link from "next/link";
import {
  HomeIcon,
  CubeIcon,
  ChartBarIcon,
  UsersIcon,
} from "@heroicons/react/24/outline";

export default function AdminSidebar() {
  return (
    <aside className="w-72 hidden md:block bg-white border-r">
      <div className="h-full flex flex-col">
        <div className="p-6 border-b">
          <Link href="/admin" className="text-lg font-bold text-indigo-600">
            Admin
          </Link>
        </div>

        <nav className="p-4 flex-1">
          <ul className="space-y-1">
            <li>
              <Link
                href="/admin"
                className="flex items-center gap-3 px-3 py-2 rounded-md hover:bg-gray-50"
              >
                <HomeIcon className="w-5 h-5" /> <span>Home</span>
              </Link>
            </li>
            <li>
              <Link
                href="/admin/products"
                className="flex items-center gap-3 px-3 py-2 rounded-md hover:bg-gray-50"
              >
                <CubeIcon className="w-5 h-5" /> <span>Products</span>
              </Link>
            </li>
            <li>
              <a className="flex items-center gap-3 px-3 py-2 rounded-md hover:bg-gray-50">
                <UsersIcon className="w-5 h-5" /> <span>Customers</span>
              </a>
            </li>
            <li>
              <a className="flex items-center gap-3 px-3 py-2 rounded-md hover:bg-gray-50">
                <ChartBarIcon className="w-5 h-5" /> <span>Analytics</span>
              </a>
            </li>
          </ul>
        </nav>

        <div className="p-4 border-t">
          <button className="w-full px-3 py-2 rounded-md bg-red-50 text-red-600">
            Logout
          </button>
        </div>
      </div>
    </aside>
  );
}
