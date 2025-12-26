import { notFound } from "next/navigation";

type Product = {
  id: string;
  ProductName: string;
  ProductPrice: number;
  SKU: string;
  Stock: number;
  createdAt: string;
};

async function getProduct(id: string): Promise<Product | null> {
  try {
    const res = await fetch(
      `api/products/${id}`,
      { cache: "no-store" } // always fresh
    );

    if (!res.ok) return null;
    return res.json();
  } catch {
    return null;
  }
}

export default async function ProductDetailPage({
  params,
}: {
  params: { id: string };
}) {
    const { id } = await params;
  const product = await getProduct(id);

  if (!product) return notFound();

  return (
    <div className="max-w-4xl mx-auto space-y-6">
      {/* Header */}
      <div className="flex items-center justify-between">
        <div>
          <h1 className="text-2xl font-semibold">
            {product.ProductName}
          </h1>
          <p className="text-sm text-gray-500">
            Product ID: {product.id}
          </p>
        </div>

        <div className="flex gap-2">
          <button className="px-4 py-2 rounded-md border">
            Edit
          </button>
          <button className="px-4 py-2 rounded-md border text-red-600">
            Delete
          </button>
        </div>
      </div>

      {/* Details Card */}
      <div className="bg-white rounded-2xl shadow p-6 grid sm:grid-cols-2 gap-6">
        <div className="space-y-3">
          <Detail label="SKU" value={product.SKU} />
          <Detail
            label="Price"
            value={`₹ ${product.ProductPrice}`}
          />
          <Detail
            label="Stock"
            value={product.Stock}
            highlight={
              product.Stock > 0 ? "success" : "danger"
            }
          />
        </div>

        <div className="space-y-3">
          <Detail
            label="Created At"
            value={new Date(product.createdAt).toLocaleString()}
          />
          <Detail label="Status" value="Active" />
        </div>
      </div>

      {/* Extra Section (optional) */}
      <div className="bg-white rounded-2xl shadow p-6">
        <h2 className="text-lg font-semibold mb-2">
          Product Description
        </h2>
        <p className="text-sm text-gray-600">
          This is a demo product description. You can extend
          MockAPI schema to include description, image, category,
          etc.
        </p>
      </div>
    </div>
  );
}

/* Reusable component */
function Detail({
  label,
  value,
  highlight,
}: {
  label: string;
  value: string | number;
  highlight?: "success" | "danger";
}) {
  return (
    <div className="flex justify-between text-sm">
      <span className="text-gray-500">{label}</span>
      <span
        className={`font-medium ${
          highlight === "success"
            ? "text-green-600"
            : highlight === "danger"
            ? "text-red-600"
            : ""
        }`}
      >
        {value}
      </span>
    </div>
  );
}
