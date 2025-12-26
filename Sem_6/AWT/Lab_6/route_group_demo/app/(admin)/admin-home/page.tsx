import React from "react";
import Link from "next/link";

export default function AdminHome() {
  return (
    <div className="space-y-6">
      <header className="flex items-center justify-between">
        <h1 className="text-2xl md:text-3xl font-semibold">Admin Dashboard</h1>
        <div className="flex items-center gap-3">
          <Link
            href="/"
            className="px-3 py-1 rounded-md text-sm border hover:bg-white"
          >
            View Site
          </Link>
          <button className="px-3 py-1 rounded-md bg-indigo-600 text-white text-sm hover:bg-indigo-700">
            New Report
          </button>
        </div>
      </header>

      <section className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-4">
        <div className="p-4 bg-white rounded-2xl shadow">
          <p className="text-sm text-gray-500">Total Users</p>
          <p className="mt-2 text-2xl font-bold">1,254</p>
        </div>

        <div className="p-4 bg-white rounded-2xl shadow">
          <p className="text-sm text-gray-500">Active Orders</p>
          <p className="mt-2 text-2xl font-bold">87</p>
        </div>

        <div className="p-4 bg-white rounded-2xl shadow">
          <p className="text-sm text-gray-500">Products</p>
          <p className="mt-2 text-2xl font-bold">342</p>
        </div>

        <div className="p-4 bg-white rounded-2xl shadow">
          <p className="text-sm text-gray-500">Revenue (30d)</p>
          <p className="mt-2 text-2xl font-bold">₹ 1.2M</p>
        </div>
      </section>

      <section className="mt-6 grid grid-cols-1 lg:grid-cols-3 gap-6">
        <div className="col-span-2 bg-white rounded-2xl shadow p-4">
          <h2 className="font-semibold mb-3">Recent Activity</h2>
          <p className="text-sm text-gray-500">
            No recent activity — sample dashboard content.
          </p>
        </div>

        <div className="bg-white rounded-2xl shadow p-4">
          <h3 className="font-semibold mb-2">Quick Actions</h3>
          <ul className="space-y-2 text-sm">
            <li>
              <Link
                href="/admin/products"
                className="text-indigo-600 hover:underline"
              >
                Manage products
              </Link>
            </li>
            <li>
              <a className="text-gray-700">View orders</a>
            </li>
            <li>
              <a className="text-gray-700">Settings</a>
            </li>
          </ul>
        </div>
      </section>
    </div>
  );
}
