import Image from "next/image";
import React from "react";

type Product = {
  id: number;
  name: string;
  sku: string;
  price: number;
  stock: number;
  description: string;
  image?: string;
};

// Simulated API call (replace with fetch)
async function getProduct(id: string): Promise<Product | null> {
  // Replace with real backend call:
  // const res = await fetch(`${process.env.API_URL}/products/${id}`);
  // return res.json();

  // Mock product
  return {
    id: Number(id),
    name: "Premium Basmati Rice (5kg)",
    sku: "RCE-005",
    price: 420,
    stock: 12,
    description:
      "High-quality long grain basmati rice with natural aroma. Perfect for daily cooking and special occasions.",
    image:
      "/next.svg", // Replace with real image URL
  };
}

export default async function ProductDetailPage({
  params,
}: {
  params: { id: string };
}) {
  const product = await getProduct(params.id);

  if (!product) {
    return (
      <div className="p-6 text-center text-gray-500">
        Product not found or deleted.
      </div>
    );
  }

  return (
    <div className="space-y-6 max-w-4xl mx-auto">
      {/* Header */}
      <div className="flex items-center justify-between">
        <h1 className="text-2xl font-semibold">{product.name}</h1>

        <a
          href="/admin/products"
          className="px-3 py-1 border rounded-md hover:bg-gray-50"
        >
          Back to Products
        </a>
      </div>

      {/* Product Card */}
      <div className="bg-white shadow rounded-2xl overflow-hidden">
        <div className="grid grid-cols-1 md:grid-cols-2">
          {/* Product Image */}
          <div className="h-64 md:h-full bg-gray-100">
            {product.image ? (
              <Image
                src={product.image}
                className="w-full h-full object-cover"
                alt={product.name}
                width={600}
                height={400}
              />
            ) : (
              <div className="flex h-full items-center justify-center text-gray-400">
                No Image
              </div>
            )}
          </div>

          {/* Product Info */}
          <div className="p-6 space-y-4">
            <div>
              <p className="text-sm text-gray-500">SKU</p>
              <p className="font-medium">{product.sku}</p>
            </div>

            <div>
              <p className="text-sm text-gray-500">Price</p>
              <p className="text-xl font-semibold">₹ {product.price}</p>
            </div>

            <div>
              <p className="text-sm text-gray-500">Stock</p>
              <p
                className={`font-medium ${
                  product.stock > 0 ? "text-green-600" : "text-red-600"
                }`}
              >
                {product.stock} units
              </p>
            </div>

            <div>
              <p className="text-sm text-gray-500 mb-1">Description</p>
              <p className="text-gray-700 leading-relaxed">
                {product.description}
              </p>
            </div>

            {/* Action Buttons */}
            <div className="flex items-center gap-3 pt-2">
              <button className="px-4 py-2 rounded-md border text-sm hover:bg-gray-50">
                Edit Product
              </button>
              <button className="px-4 py-2 rounded-md bg-red-600 text-white text-sm hover:bg-red-700">
                Delete Product
              </button>
            </div>
          </div>
        </div>
      </div>

      {/* Extra Info (optional) */}
      <div className="bg-white shadow rounded-2xl p-6">
        <h2 className="font-semibold mb-3">Additional Information</h2>
        <p className="text-gray-600 text-sm">
          Add ingredients, size info, weight details, supplier info, etc.
        </p>
      </div>
    </div>
  );
}
