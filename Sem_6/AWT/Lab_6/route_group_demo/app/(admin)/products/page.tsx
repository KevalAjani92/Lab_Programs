"use client";

import React, { useEffect, useState } from "react";

type Product = {
  id: number;
  name: string;
  sku: string;
  price: number;
  stock: number;
};

export default function AdminProducts() {
  const [products, setProducts] = useState<Product[] | null>(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    // Replace with real API call to /api/admin/products
    const timer = setTimeout(() => {
      setProducts([
        { id: 1, name: "Apple (1 kg)", sku: "APL-001", price: 120, stock: 24 },
        { id: 2, name: "Milk (1 L)", sku: "MLK-001", price: 55, stock: 80 },
        { id: 3, name: "Rice (5 kg)", sku: "RCE-005", price: 420, stock: 12 },
      ]);
      setLoading(false);
    }, 600);

    return () => clearTimeout(timer);
  }, []);

  return (
    <div className="space-y-4">
      <div className="flex items-center justify-between">
        <h1 className="text-xl font-semibold">Products</h1>
        <div className="flex items-center gap-2">
          <input
            type="search"
            placeholder="Search product"
            className="px-3 py-2 border rounded-md"
          />
          <button className="px-3 py-2 rounded-md bg-indigo-600 text-white">
            Add product
          </button>
        </div>
      </div>

      <div className="bg-white rounded-2xl shadow overflow-x-auto">
        <table className="min-w-full text-left">
          <thead className="border-b">
            <tr>
              <th className="px-4 py-3 text-sm text-gray-500">Name</th>
              <th className="px-4 py-3 text-sm text-gray-500">SKU</th>
              <th className="px-4 py-3 text-sm text-gray-500">Price</th>
              <th className="px-4 py-3 text-sm text-gray-500">Stock</th>
              <th className="px-4 py-3 text-sm text-gray-500">Actions</th>
            </tr>
          </thead>

          <tbody>
            {loading && (
              <tr>
                <td colSpan={5} className="p-6 text-center text-gray-500">
                  Loading…
                </td>
              </tr>
            )}

            {products?.map((p) => (
              <tr key={p.id} className="border-t">
                <td className="px-4 py-3">{p.name}</td>
                <td className="px-4 py-3">{p.sku}</td>
                <td className="px-4 py-3">₹ {p.price}</td>
                <td className="px-4 py-3">{p.stock}</td>
                <td className="px-4 py-3">
                  <div className="flex items-center gap-2">
                    <button className="text-sm px-2 py-1 rounded-md border">
                      Edit
                    </button>
                    <button className="text-sm px-2 py-1 rounded-md border text-red-600">
                      Delete
                    </button>
                  </div>
                </td>
              </tr>
            ))}

            {!loading && products?.length === 0 && (
              <tr>
                <td colSpan={5} className="p-6 text-center text-gray-500">
                  No products found.
                </td>
              </tr>
            )}
          </tbody>
        </table>
      </div>
    </div>
  );
}
