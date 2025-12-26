"use client";

import React from "react";
import { Bars3Icon, BellIcon } from "@heroicons/react/24/outline";

export default function AdminHeader() {
  return (
    <header className="flex items-center justify-between px-4 py-3 bg-white border-b">
      <div className="flex items-center gap-3">
        <button className="md:hidden p-2 rounded-md hover:bg-gray-100">
          <Bars3Icon className="w-5 h-5" />
        </button>
        <h2 className="text-lg font-medium">Welcome, Admin</h2>
      </div>

      <div className="flex items-center gap-4">
        <button className="p-2 rounded-md hover:bg-gray-100">
          <BellIcon className="w-5 h-5" />
        </button>

        <div className="flex items-center gap-2">
          <div className="w-9 h-9 rounded-full bg-gray-200 flex items-center justify-center">
            A
          </div>
          <div className="hidden sm:block">
            <div className="text-sm font-medium">Admin</div>
            <div className="text-xs text-gray-500">admin@yourapp.com</div>
          </div>
        </div>
      </div>
    </header>
  );
}
