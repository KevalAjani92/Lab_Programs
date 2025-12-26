// app/page.tsx
"use client";

import React, { JSX, useState } from "react";
import Image from "next/image";
import {
  Combobox,
  Popover,
  PopoverButton,
  PopoverPanel,
  PopoverGroup,
} from "@headlessui/react";
import {
  Bars3Icon,
  ChevronDownIcon,
  MagnifyingGlassIcon,
  ShoppingBagIcon,
  DevicePhoneMobileIcon,
  CubeIcon,
  SparklesIcon,
  TruckIcon,
  StarIcon,
  HeartIcon,
} from "@heroicons/react/24/outline";
import { CheckIcon, PlayCircleIcon } from "@heroicons/react/20/solid";
// import { Carousel } from "flowbite";

type Category = {
  id: string;
  name: string;
  desc: string;
  href: string;
  icon: React.ComponentType<{ className?: string; "aria-hidden"?: boolean }>;
};

type Product = {
  id: string;
  name: string;
  price: number;
  image: string;
  badge?: string;
  rating?: number;
};

const CATEGORIES: Category[] = [
  {
    id: "electronics",
    name: "Electronics",
    desc: "Phones, TVs, audio",
    href: "/category/electronics",
    icon: DevicePhoneMobileIcon,
  },
  {
    id: "apparel",
    name: "Apparel",
    desc: "Clothing & shoes",
    href: "/category/apparel",
    icon: ShoppingBagIcon,
  },
  {
    id: "home",
    name: "Home & Kitchen",
    desc: "Furniture, decor",
    href: "/category/home",
    icon: CubeIcon,
  },
  {
    id: "beauty",
    name: "Beauty",
    desc: "Skincare & grooming",
    href: "/category/beauty",
    icon: SparklesIcon,
  },
  {
    id: "outdoor",
    name: "Outdoor",
    desc: "Bikes & outdoor gear",
    href: "/category/outdoor",
    icon: TruckIcon,
  },
];

const FEATURED: Product[] = [
  {
    id: "p1",
    name: "Wireless Headphones",
    price: 149.99,
    image:
      "https://plus.unsplash.com/premium_photo-1678099940967-73fe30680949?fm=jpg&q=60&w=3000&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8d2lyZWxlc3MlMjBoZWFkcGhvbmVzfGVufDB8fDB8fHww",
    badge: "15% off",
    rating: 4.6,
  },
  {
    id: "p2",
    name: "Smartphone 128GB",
    price: 699.0,
    image:
      "https://plus.unsplash.com/premium_photo-1678099940967-73fe30680949?fm=jpg&q=60&w=3000&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8d2lyZWxlc3MlMjBoZWFkcGhvbmVzfGVufDB8fDB8fHww",
    badge: "New",
    rating: 4.7,
  },
  {
    id: "p3",
    name: '4K Smart TV 55"',
    price: 499.0,
    image:
      "https://plus.unsplash.com/premium_photo-1678099940967-73fe30680949?fm=jpg&q=60&w=3000&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8d2lyZWxlc3MlMjBoZWFkcGhvbmVzfGVufDB8fDB8fHww",
    badge: "Featured",
    rating: 4.4,
  },
  {
    id: "p4",
    name: "Running Shoes",
    price: 69.99,
    image:
      "https://plus.unsplash.com/premium_photo-1678099940967-73fe30680949?fm=jpg&q=60&w=3000&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8d2lyZWxlc3MlMjBoZWFkcGhvbmVzfGVufDB8fDB8fHww",
    badge: "20% off",
    rating: 4.3,
  },
];

function HeroSection() {
  return (
    <section className="relative overflow-hidden bg-gradient-to-r from-indigo-600 to-indigo-500 text-white">
      <div className="mx-auto max-w-7xl px-4 py-14 sm:py-20 lg:py-24">
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-8 items-center">
          <div>
            <h1 className="text-4xl font-extrabold sm:text-5xl">
              Shop the latest deals. Delivered fast.
            </h1>
            <p className="mt-4 text-lg text-indigo-100/90 max-w-xl">
              Curated products, verified sellers, and same-day delivery in many
              cities. Get exclusive app-only offers.
            </p>
            <div className="mt-8 flex gap-3">
              <a
                href="#"
                className="inline-flex items-center gap-2 rounded-md bg-white/10 px-4 py-2 text-sm font-semibold hover:bg-white/20"
              >
                <PlayCircleIcon className="h-5 w-5 text-white" /> Watch how it
                works
              </a>
              <a
                href="#featured"
                className="inline-flex items-center gap-2 rounded-md bg-white px-4 py-2 text-sm font-semibold text-indigo-600 hover:opacity-95"
              >
                Shop Bestsellers
              </a>
            </div>
            <div className="mt-6 flex flex-wrap gap-3 text-sm text-indigo-100/75">
              <div className="flex items-center gap-2">
                <span className="rounded-full bg-white/20 px-2 py-1">
                  Free shipping
                </span>
                <span className="rounded-full bg-white/10 px-2 py-1">
                  30-day returns
                </span>
              </div>
            </div>
          </div>

          <div className="relative isolate flex justify-center">
            <div className="w-full max-w-lg rounded-2xl bg-white/10 p-6">
              <Image
                src="https://plus.unsplash.com/premium_photo-1678099940967-73fe30680949?fm=jpg&q=60&w=3000&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8d2lyZWxlc3MlMjBoZWFkcGhvbmVzfGVufDB8fDB8fHww"
                alt="hero"
                width={800}
                height={600}
                className="rounded-md object-cover"
              />
            </div>
          </div>

          {/* <Carousel></Carousel> */}
        </div>
      </div>
    </section>
  );
}

function ProductCard({ product }: { product: Product }) {
  return (
    <article className="group rounded-xl border bg-white shadow-sm overflow-hidden">
      <div className="relative h-48 w-full overflow-hidden">
        <Image
          src={product.image}
          alt={product.name}
          fill
          className="object-cover"
        />
        {product.badge && (
          <span className="absolute left-3 top-3 rounded-full bg-indigo-600/90 px-2 py-1 text-xs font-semibold text-white">
            {product.badge}
          </span>
        )}
      </div>

      <div className="p-4">
        <h3 className="text-sm font-semibold text-gray-900">{product.name}</h3>
        <div className="mt-2 flex items-center justify-between">
          <div className="text-lg font-bold text-indigo-600">
            ${product.price}
          </div>
          <div className="flex items-center gap-1 text-sm text-gray-500">
            <StarIcon className="h-4 w-4 text-yellow-400" />{" "}
            {product.rating ?? "--"}
          </div>
        </div>
        <div className="mt-4 flex gap-2">
          <button className="flex-1 rounded-md border border-gray-200 px-3 py-2 text-sm text-gray-700 hover:bg-gray-50">
            Add to cart
          </button>
          <button className="rounded-md border border-gray-200 px-3 py-2 text-sm text-gray-700 hover:bg-gray-50">
            <HeartIcon className="h-5 w-5" />
          </button>
        </div>
      </div>
    </article>
  );
}

export default function HomePage(): JSX.Element {
  const [query, setQuery] = useState("");
  const [selected, setSelected] = useState<string | null>(null);

  const suggestions = [
    "Wireless Headphones",
    "Smartphone",
    "4K TV",
    "Running Shoes",
    "Kitchen Knife Set",
    "Organic Moisturizer",
  ];
  const filtered =
    query === ""
      ? suggestions
      : suggestions.filter((s) =>
          s.toLowerCase().includes(query.toLowerCase())
        );

  return (
    <main className="flex-grow bg-gray-50">
      {/* Top strip: categories popover + small search (you said layout handles header/footer) */}
      <div className="mx-auto max-w-7xl px-4 py-6 sm:px-6 lg:px-8">
        <div className="flex items-center gap-4">
          <PopoverGroup className="hidden sm:flex sm:gap-2">
            <Popover className="relative">
              <PopoverButton className="flex items-center gap-2 rounded-md px-3 py-2 text-sm font-medium bg-white shadow-sm hover:shadow-md">
                <span className="flex items-center gap-2">
                  <ChevronDownIcon className="h-4 w-4 text-gray-500" />
                  Categories
                </span>
              </PopoverButton>

              <PopoverPanel className="absolute z-20 mt-2 w-80 rounded-xl bg-white shadow-lg ring-1 ring-black/5 max-h-[360px] overflow-y-auto">
                <div className="p-4">
                  {CATEGORIES.map((c) => (
                    <a
                      key={c.id}
                      href={c.href}
                      className="flex items-start gap-3 p-3 rounded-md hover:bg-gray-50"
                    >
                      <div className="flex h-10 w-10 items-center justify-center rounded-lg bg-gray-100">
                        <c.icon className="h-6 w-6 text-gray-700" />
                      </div>
                      <div>
                        <div className="text-sm font-semibold text-gray-900">
                          {c.name}
                        </div>
                        <div className="text-xs text-gray-500">{c.desc}</div>
                      </div>
                    </a>
                  ))}
                </div>
              </PopoverPanel>
            </Popover>
          </PopoverGroup>

          <div className="flex-1">
            <Combobox value={selected} onChange={(v) => setSelected(v)}>
              <div className="relative">
                <MagnifyingGlassIcon className="pointer-events-none absolute left-3 top-3 h-5 w-5 text-gray-400" />
                <Combobox.Input
                  className="w-full rounded-md border border-gray-200 bg-white py-2 pl-10 pr-4 text-sm shadow-sm focus:border-indigo-500 focus:ring-indigo-500"
                  placeholder="Search products, categories..."
                  onChange={(e) => setQuery(e.target.value)}
                  displayValue={(v: string | null) => (v ? v : "")}
                />

                {filtered.length > 0 && (
                  <Combobox.Options className="absolute z-30 mt-1 w-full rounded-md bg-white shadow-lg ring-1 ring-black/5 max-h-56 overflow-auto">
                    {filtered.map((result) => (
                      <Combobox.Option
                        key={result}
                        value={result}
                        className={({ active }) =>
                          `cursor-pointer px-3 py-2 text-sm ${
                            active
                              ? "bg-indigo-50 text-indigo-700"
                              : "text-gray-700"
                          }`
                        }
                      >
                        {({ selected: isSelected }) => (
                          <div className="flex items-center justify-between">
                            <div className="truncate">{result}</div>
                            {isSelected ? (
                              <CheckIcon className="h-4 w-4 text-indigo-600" />
                            ) : null}
                          </div>
                        )}
                      </Combobox.Option>
                    ))}
                  </Combobox.Options>
                )}
              </div>
            </Combobox>
          </div>

          <div className="hidden sm:flex items-center gap-4">
            <a
              className="inline-flex items-center gap-2 text-sm font-medium text-gray-700"
              href="#"
            >
              <ShoppingBagIcon className="h-5 w-5" /> Cart
            </a>
          </div>
        </div>
      </div>

      {/* Hero */}
      <HeroSection />

      {/* Featured */}
      <section
        id="featured"
        className="mx-auto max-w-7xl px-4 py-10 sm:px-6 lg:px-8"
      >
        <div className="flex items-center justify-between">
          <h2 className="text-2xl font-bold text-gray-900">
            Featured Products
          </h2>
          <a
            className="text-sm text-indigo-600 hover:underline"
            href="/products"
          >
            View all
          </a>
        </div>

        <div className="mt-6 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-4">
          {FEATURED.map((p) => (
            <ProductCard key={p.id} product={p} />
          ))}
        </div>
      </section>

      {/* Top deals horizontal scroller */}
      <section className="bg-white/70">
        <div className="mx-auto max-w-7xl px-4 py-10 sm:px-6 lg:px-8">
          <h3 className="text-xl font-bold text-gray-900">Top Deals</h3>
          <div className="mt-4 -mx-4 overflow-x-auto py-4 scroll-smooth snap-x snap-mandatory">
            <div className="flex gap-4 px-4 snap-start">
              {FEATURED.map((p) => (
                <div key={p.id} className="min-w-[260px] snap-center">
                  <div className="rounded-lg bg-white p-4 shadow">
                    <div className="h-40 w-full overflow-hidden rounded-md">
                      <Image
                        src={p.image}
                        alt={p.name}
                        width={600}
                        height={400}
                        className="object-cover"
                      />
                    </div>
                    <div className="mt-3">
                      <div className="text-sm font-semibold">{p.name}</div>
                      <div className="text-indigo-600 font-bold">
                        ${p.price}
                      </div>
                    </div>
                  </div>
                </div>
              ))}
            </div>
          </div>
        </div>
      </section>

      {/* Info / Newsletter */}
      <section className="mx-auto max-w-7xl px-4 py-12 sm:px-6 lg:px-8">
        <div className="grid grid-cols-1 lg:grid-cols-3 gap-8">
          <div className="rounded-xl bg-white p-6 shadow">
            <h4 className="font-semibold text-lg">Why ShopNext?</h4>
            <p className="mt-3 text-sm text-gray-600">
              Fast delivery, verified sellers, and product guarantees. We make
              shopping easy.
            </p>
          </div>

          <div className="rounded-xl bg-white p-6 shadow">
            <h4 className="font-semibold text-lg">Customer Reviews</h4>
            <div className="mt-3 space-y-3 text-sm text-gray-600">
              <p>“Great service and fast delivery!” — Asha</p>
              <p>“Quality matches the description.” — Rohan</p>
            </div>
          </div>

          <div className="rounded-xl bg-white p-6 shadow">
            <h4 className="font-semibold text-lg">Newsletter</h4>
            <p className="mt-2 text-sm text-gray-600">
              Get deals & updates — delivered weekly.
            </p>
            <form
              className="mt-4 flex gap-2"
              onSubmit={(e) => e.preventDefault()}
            >
              <input
                className="flex-1 rounded-md border px-3 py-2 text-sm"
                placeholder="Your email"
              />
              <button className="rounded-md bg-indigo-600 px-4 py-2 text-sm font-semibold text-white">
                Subscribe
              </button>
            </form>
          </div>
        </div>
      </section>
    </main>
  );
}
