"use client";

import React, { useEffect, useState } from "react";
import { useRouter } from "next/navigation";

type Product = {
  id: string | number;
  ProductName: string;
  ProductPrice: number;
  createdAt: string;
  SKU: string;
  Stock: number;
};

export default function AdminProducts() {
  const [products, setProducts] = useState<Product[] | null>(null);
  const [loading, setLoading] = useState(true);
  const router = useRouter();

  useEffect(() => {
    const fetchProducts = async () => {
      try {
        const response = await fetch(
          "https://6940e25d993d68afba6d589d.mockapi.io/api/Products"
        );
        const data = await response.json();
        setProducts(data);
      } catch (error) {
        console.error("Error fetching products:", error);
        setProducts([]);
      } finally {
        setLoading(false);
      }
    };

    fetchProducts();
  }, []);

  return (
    <div className="space-y-6">
      {/* Header */}
      <div className="flex items-center justify-between">
        <h1 className="text-xl font-semibold">Products</h1>
        <div className="flex items-center gap-2">
          <input
            type="search"
            placeholder="Search product"
            className="px-3 py-2 border rounded-md"
          />
          <button className="px-4 py-2 rounded-md bg-indigo-600 text-white">
            Add product
          </button>
        </div>
      </div>

      {/* Loading */}
      {loading && (
        <div className="text-center text-gray-500 py-10">
          Loading products…
        </div>
      )}

      {/* Empty */}
      {!loading && products?.length === 0 && (
        <div className="text-center text-gray-500 py-10">
          No products found.
        </div>
      )}

      {/* Cards */}
      <div className="grid gap-6 sm:grid-cols-2 lg:grid-cols-3 xl:grid-cols-4">
        {products?.map((p) => (
          <div
            key={p.id}
            onClick={() => router.push(`/products/${p.id}`)}
            className="
              bg-white border-2 rounded-2xl p-5
              shadow transition-all duration-200
              hover:shadow-lg hover:-translate-y-1 hover:scale-[1.02]
              cursor-pointer
              flex flex-col justify-between
            "
          >
            {/* Info */}
            <div className="space-y-2">
              <h2 className="text-lg font-semibold">
                {p.ProductName}
              </h2>

              <p className="text-sm text-gray-500">
                SKU: <span className="font-medium">{p.SKU}</span>
              </p>

              <p className="text-lg font-bold text-indigo-600">
                ₹ {p.ProductPrice}
              </p>

              <p
                className={`text-sm font-medium ${
                  p.Stock > 0 ? "text-green-600" : "text-red-600"
                }`}
              >
                Stock: {p.Stock}
              </p>
            </div>

            {/* Actions */}
            <div className="flex gap-2 mt-4">
              <button
                onClick={(e) => {
                  e.stopPropagation();
                  console.log("Edit", p.id);
                }}
                className="flex-1 text-sm px-3 py-2 rounded-md border hover:bg-gray-50"
              >
                Edit
              </button>

              <button
                onClick={(e) => {
                  e.stopPropagation();
                  console.log("Delete", p.id);
                }}
                className="flex-1 text-sm px-3 py-2 rounded-md border text-red-600 hover:bg-red-50"
              >
                Delete
              </button>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}
