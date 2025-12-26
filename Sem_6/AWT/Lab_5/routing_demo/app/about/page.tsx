// app/about/page.tsx
"use client";

import React from "react";
import Image from "next/image";
import { Disclosure } from "@headlessui/react";
import { ChevronUpIcon } from "@heroicons/react/20/solid";
import {
  BoltIcon,
  UserGroupIcon,
  GlobeAltIcon,
  SparklesIcon,
  ClockIcon,
} from "@heroicons/react/24/outline";

type TeamMember = {
  id: string;
  name: string;
  role: string;
  img: string;
  bio?: string;
};

const TEAM: TeamMember[] = [
  {
    id: "t1",
    name: "Asha Patel",
    role: "Founder & CEO",
    img: "https://images.unsplash.com/photo-1544005313-94ddf0286df2?q=80&w=800&auto=format&fit=crop",
    bio: "Product enthusiast and obsessed with delightful shopping experiences.",
  },
  {
    id: "t2",
    name: "Rohan Verma",
    role: "CTO",
    img: "https://images.unsplash.com/photo-1547425260-76bcadfb4f2c?q=80&w=800&auto=format&fit=crop",
    bio: "Builds scalable systems and loves edge-case debugging.",
  },
  {
    id: "t3",
    name: "Meera Singh",
    role: "Head of Merchandising",
    img: "https://images.unsplash.com/photo-1545996124-9b0b8f7d4c8f?q=80&w=800&auto=format&fit=crop",
    bio: "Curates products that customers actually love.",
  },
];

const FAQ = [
  {
    q: "Where are you located?",
    a: "We are headquartered in Mumbai, India with remote teams across the country.",
  },
  {
    q: "How do you choose sellers?",
    a: "Sellers are vetted for quality, shipping reliability and customer support before listing.",
  },
  {
    q: "What is your return policy?",
    a: "Most items are eligible for return within 30 days — see our Returns page for details.",
  },
];

export default function AboutPage(): JSX.Element {
  return (
    <main className="flex-grow bg-gray-50">
      {/* Hero */}
      <section className="bg-white">
        <div className="mx-auto max-w-7xl px-4 py-16 sm:px-6 lg:px-8">
          <div className="grid grid-cols-1 gap-8 lg:grid-cols-2 lg:items-center">
            <div>
              <h1 className="text-3xl font-extrabold text-gray-900 sm:text-4xl">
                We make shopping simple, fast & trusted
              </h1>
              <p className="mt-4 text-lg text-gray-600">
                Built for real people — curated products, verified sellers, and a
                delightful checkout. Our mission is to bring the best products to
                your doorstep, quickly and reliably.
              </p>

              <div className="mt-6 flex flex-wrap gap-3">
                <a
                  href="/contact"
                  className="inline-flex items-center rounded-md bg-indigo-600 px-4 py-2 text-sm font-semibold text-white shadow-sm hover:bg-indigo-700"
                >
                  Contact us
                </a>
                <a
                  href="/products"
                  className="inline-flex items-center rounded-md border border-gray-200 px-4 py-2 text-sm font-medium text-gray-700 hover:bg-gray-50"
                >
                  Browse products
                </a>
              </div>
            </div>

            <div className="relative flex items-center justify-center">
              <div className="w-full max-w-lg overflow-hidden rounded-xl bg-gray-100 p-2">
                <Image
                  src="https://plus.unsplash.com/premium_photo-1678099940967-73fe30680949?fm=jpg&q=60&w=1200"
                  alt="Our mission"
                  width={1200}
                  height={800}
                  className="rounded-md object-cover"
                />
              </div>
            </div>
          </div>
        </div>
      </section>

      {/* Values */}
      <section className="mx-auto max-w-7xl px-4 py-12 sm:px-6 lg:px-8">
        <h2 className="text-xl font-bold text-gray-900">Our values</h2>
        <p className="mt-2 text-sm text-gray-600 max-w-2xl">
          We focus on speed, quality, and trust. Everything we build is guided by
          these principles.
        </p>

        <div className="mt-8 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-4">
          <div className="rounded-lg bg-white p-6 shadow">
            <BoltIcon className="h-6 w-6 text-indigo-600" />
            <h3 className="mt-3 text-sm font-semibold text-gray-900">Speed</h3>
            <p className="mt-2 text-sm text-gray-600">Fast delivery and instant search results.</p>
          </div>

          <div className="rounded-lg bg-white p-6 shadow">
            <UserGroupIcon className="h-6 w-6 text-indigo-600" />
            <h3 className="mt-3 text-sm font-semibold text-gray-900">People first</h3>
            <p className="mt-2 text-sm text-gray-600">Customer experience drives our decisions.</p>
          </div>

          <div className="rounded-lg bg-white p-6 shadow">
            <GlobeAltIcon className="h-6 w-6 text-indigo-600" />
            <h3 className="mt-3 text-sm font-semibold text-gray-900">Global reach</h3>
            <p className="mt-2 text-sm text-gray-600">We strive to serve customers across regions.</p>
          </div>

          <div className="rounded-lg bg-white p-6 shadow">
            <SparklesIcon className="h-6 w-6 text-indigo-600" />
            <h3 className="mt-3 text-sm font-semibold text-gray-900">Quality</h3>
            <p className="mt-2 text-sm text-gray-600">Curated products from trusted sellers.</p>
          </div>
        </div>
      </section>

      {/* Team */}
      <section className="bg-white">
        <div className="mx-auto max-w-7xl px-4 py-12 sm:px-6 lg:px-8">
          <h2 className="text-xl font-bold text-gray-900">Meet the team</h2>
          <p className="mt-2 text-sm text-gray-600">A small team with big dreams.</p>

          <div className="mt-8 grid grid-cols-1 gap-6 sm:grid-cols-2 lg:grid-cols-3">
            {TEAM.map((m) => (
              <div key={m.id} className="flex gap-4 rounded-lg bg-gray-50 p-4 shadow-sm">
                <div className="relative h-20 w-20 flex-shrink-0 overflow-hidden rounded-lg">
                  <Image src={m.img} alt={m.name} fill className="object-cover" />
                </div>
                <div>
                  <div className="text-sm font-semibold text-gray-900">{m.name}</div>
                  <div className="text-xs text-gray-500">{m.role}</div>
                  <p className="mt-2 text-sm text-gray-600">{m.bio}</p>
                </div>
              </div>
            ))}
          </div>
        </div>
      </section>

      {/* Timeline */}
      <section className="mx-auto max-w-7xl px-4 py-12 sm:px-6 lg:px-8">
        <h2 className="text-xl font-bold text-gray-900">Our journey</h2>
        <div className="mt-6 space-y-6">
          <div className="flex items-start gap-4">
            <div className="mt-1 rounded-full bg-indigo-600 p-2 text-white">
              <ClockIcon className="h-5 w-5" />
            </div>
            <div>
              <div className="text-sm font-semibold text-gray-900">Founded</div>
              <div className="mt-1 text-sm text-gray-600">2019 — We started as a small marketplace focused on local sellers.</div>
            </div>
          </div>

          <div className="flex items-start gap-4">
            <div className="mt-1 rounded-full bg-indigo-600 p-2 text-white">
              <SparklesIcon className="h-5 w-5" />
            </div>
            <div>
              <div className="text-sm font-semibold text-gray-900">Milestone</div>
              <div className="mt-1 text-sm text-gray-600">2021 — Reached 1M orders and launched same-day delivery in select cities.</div>
            </div>
          </div>

          <div className="flex items-start gap-4">
            <div className="mt-1 rounded-full bg-indigo-600 p-2 text-white">
              <GlobeAltIcon className="h-5 w-5" />
            </div>
            <div>
              <div className="text-sm font-semibold text-gray-900">Growth</div>
              <div className="mt-1 text-sm text-gray-600">2023 — Expanded our catalog and introduced verified-seller program.</div>
            </div>
          </div>
        </div>
      </section>

      {/* FAQ */}
      <section className="bg-white">
        <div className="mx-auto max-w-4xl px-4 py-12 sm:px-6 lg:px-8">
          <h2 className="text-xl font-bold text-gray-900">Frequently asked questions</h2>
          <div className="mt-6 space-y-3">
            {FAQ.map((item, idx) => (
              <Disclosure key={idx} as="div" className="rounded-lg bg-gray-50 p-4">
                {({ open }) => (
                  <>
                    <Disclosure.Button className="flex w-full items-center justify-between gap-3 text-left">
                      <span className="text-sm font-medium text-gray-900">{item.q}</span>
                      <ChevronUpIcon className={`h-5 w-5 text-gray-500 transition-transform ${open ? "rotate-180" : ""}`} />
                    </Disclosure.Button>
                    <Disclosure.Panel className="mt-3 text-sm text-gray-600">{item.a}</Disclosure.Panel>
                  </>
                )}
              </Disclosure>
            ))}
          </div>
        </div>
      </section>

      {/* CTA */}
      <section className="mx-auto max-w-7xl px-4 py-12 sm:px-6 lg:px-8">
        <div className="rounded-xl bg-indigo-600 p-8 text-white shadow">
          <div className="flex flex-col items-start gap-4 sm:flex-row sm:items-center sm:justify-between">
            <div>
              <h3 className="text-lg font-bold">Ready to get started?</h3>
              <p className="mt-1 text-sm text-indigo-100/90">Create an account and enjoy exclusive offers and faster checkout.</p>
            </div>
            <div className="mt-4 sm:mt-0">
              <a href="/signup" className="inline-flex items-center gap-2 rounded-md bg-white px-4 py-2 text-sm font-semibold text-indigo-600">
                Create account
              </a>
            </div>
          </div>
        </div>
      </section>
    </main>
  );
}
