"use client";

import { useState } from "react";
import {
  Dialog,
  DialogPanel,
  Disclosure,
  DisclosureButton,
  DisclosurePanel,
  Popover,
  PopoverButton,
  PopoverGroup,
  PopoverPanel,
} from "@headlessui/react";
import {
  Bars3Icon,
  XMarkIcon,
  DevicePhoneMobileIcon,
  ShoppingBagIcon,
  CubeIcon,
  SparklesIcon,
  TruckIcon,
  FingerPrintIcon,
} from "@heroicons/react/24/outline";
import {
  ChevronDownIcon,
  PhoneIcon,
  PlayCircleIcon,
} from "@heroicons/react/20/solid";
import Image from "next/image";
import Link from "next/link";

/**
 * Categories structure for header dropdown (e-commerce)
 * Each category has an icon and an `items` array for sub-links
 */
const categories = [
  {
    id: "cat-electronics",
    name: "Electronics",
    description: "Phones, audio, TVs and smart devices",
    href: "/category/electronics",
    icon: DevicePhoneMobileIcon,
    items: [
      { name: "Smartphones", href: "/category/electronics/smartphones" },
      { name: "Headphones", href: "/category/electronics/headphones" },
      { name: "Televisions", href: "/category/electronics/tv" },
      { name: "Smart Home", href: "/category/electronics/smart-home" },
    ],
  },
  {
    id: "cat-apparel",
    name: "Apparel",
    description: "Clothing, shoes & accessories",
    href: "/category/apparel",
    icon: ShoppingBagIcon,
    items: [
      { name: "Men", href: "/category/apparel/men" },
      { name: "Women", href: "/category/apparel/women" },
      { name: "Kids", href: "/category/apparel/kids" },
      { name: "Shoes", href: "/category/apparel/shoes" },
    ],
  },
  {
    id: "cat-home",
    name: "Home & Kitchen",
    description: "Cookware, decor and appliances",
    href: "/category/home-kitchen",
    icon: CubeIcon,
    items: [
      { name: "Kitchen", href: "/category/home-kitchen/kitchen" },
      { name: "Furniture", href: "/category/home-kitchen/furniture" },
      { name: "Storage", href: "/category/home-kitchen/storage" },
      { name: "Bedding", href: "/category/home-kitchen/bedding" },
    ],
  },
  {
    id: "cat-beauty",
    name: "Beauty & Personal Care",
    description: "Skincare, haircare & grooming",
    href: "/category/beauty",
    icon: SparklesIcon,
    items: [
      { name: "Skincare", href: "/category/beauty/skincare" },
      { name: "Makeup", href: "/category/beauty/makeup" },
      { name: "Haircare", href: "/category/beauty/haircare" },
      { name: "Fragrances", href: "/category/beauty/fragrances" },
    ],
  },
  {
    id: "cat-outdoor",
    name: "Outdoor & Fitness",
    description: "Sporting goods & outdoor gear",
    href: "/category/outdoor-fitness",
    icon: TruckIcon,
    items: [
      { name: "Exercise & Training", href: "/category/outdoor/exercise" },
      { name: "Outdoor Gear", href: "/category/outdoor/gear" },
      { name: "Cycling", href: "/category/outdoor/cycling" },
      { name: "Scooters & E-bikes", href: "/category/outdoor/scooters" },
    ],
  },
];

const callsToAction = [
  { name: "Watch demo", href: "#", icon: PlayCircleIcon },
  { name: "Contact sales", href: "#", icon: PhoneIcon },
];

export default function Header() {
  const [mobileMenuOpen, setMobileMenuOpen] = useState(false);

  return (
    <header className="bg-white">
      <nav
        aria-label="Global"
        className="mx-auto flex max-w-7xl items-center justify-between p-6 lg:px-8"
      >
        <div className="flex lg:flex-1">
          <a href="#" className="-m-1.5 p-1.5">
            <span className="sr-only">Your Company</span>
            <Image
              alt=""
              src="https://tailwindcss.com/plus-assets/img/logos/mark.svg?color=indigo&shade=600"
              className="h-8 w-auto"
              width={32}
              height={32}
            />
          </a>
        </div>

        <div className="flex lg:hidden">
          <button
            type="button"
            onClick={() => setMobileMenuOpen(true)}
            className="-m-2.5 inline-flex items-center justify-center rounded-md p-2.5 text-gray-700"
          >
            <span className="sr-only">Open main menu</span>
            <Bars3Icon aria-hidden="true" className="h-6 w-6" />
          </button>
        </div>

        <PopoverGroup className="hidden lg:flex lg:gap-x-12">
          <Link href="/" className="text-sm/6 font-semibold text-gray-900">
            Home
          </Link>
          <Link href="/contact" className="text-sm/6 font-semibold text-gray-900">
            Auth
          </Link>
          <Link href="/about" className="text-sm/6 font-semibold text-gray-900">
            Admin
          </Link>
          
          <Link href="/about" className="text-sm/6 font-semibold text-gray-900">
            Client
          </Link>

          
        </PopoverGroup>

        {/* Search Bar */}
        <div className="hidden lg:flex lg:flex-1 lg:justify-end">
          <div className="relative w-64">
            <input
              type="text"
              placeholder="Search..."
              className="w-full rounded-md border border-gray-300 px-3 py-2 pl-10 text-sm shadow-sm focus:border-indigo-500 focus:ring-indigo-500"
            />
            <svg
              className="absolute left-3 top-2.5 h-5 w-5 text-gray-400"
              xmlns="http://www.w3.org/2000/svg"
              fill="none"
              viewBox="0 0 24 24"
              strokeWidth="1.5"
              stroke="currentColor"
            >
              <path
                strokeLinecap="round"
                strokeLinejoin="round"
                d="M21 21l-4.35-4.35m0 0A7.5 7.5 0 104.5 4.5a7.5 7.5 0 0012.15 12.15z"
              />
            </svg>
          </div>
        </div>
      </nav>

      <Dialog
        open={mobileMenuOpen}
        onClose={setMobileMenuOpen}
        className="lg:hidden"
      >
        <div className="fixed inset-0 z-50" />
        <DialogPanel className="fixed inset-y-0 right-0 z-50 w-full overflow-y-auto bg-white p-6 sm:max-w-sm sm:ring-1 sm:ring-gray-900/10">
          <div className="flex items-center justify-between">
            <a href="#" className="-m-1.5 p-1.5">
              <span className="sr-only">Your Company</span>
              <Image
                alt=""
                src="https://tailwindcss.com/plus-assets/img/logos/mark.svg?color=indigo&shade=600"
                className="h-8 w-auto"
                width={32}
                height={32}
              />
            </a>
            <button
              type="button"
              onClick={() => setMobileMenuOpen(false)}
              className="-m-2.5 rounded-md p-2.5 text-gray-700"
            >
              <span className="sr-only">Close menu</span>
              <XMarkIcon aria-hidden="true" className="h-6 w-6" />
            </button>
          </div>

          <div className="mt-6 flow-root">
            <div className="-my-6 divide-y divide-gray-500/10">
              <div className="space-y-2 py-6">
                <Link
                  href="/"
                  className="-mx-3 block rounded-lg px-3 py-2 text-base/7 font-semibold text-gray-900 hover:bg-gray-50"
                >
                  Home
                </Link>
                <Link
                  href="/contact"
                  className="-mx-3 block rounded-lg px-3 py-2 text-base/7 font-semibold text-gray-900 hover:bg-gray-50"
                >
                  Auth
                </Link>
                <Link
                  href="/about"
                  className="-mx-3 block rounded-lg px-3 py-2 text-base/7 font-semibold text-gray-900 hover:bg-gray-50"
                >
                  Admin
                </Link>
                
                <Link
                  href="/about"
                  className="-mx-3 block rounded-lg px-3 py-2 text-base/7 font-semibold text-gray-900 hover:bg-gray-50"
                >
                  Client
                </Link>

                
              </div>

              {/* <div className="py-6">
                <a
                  href="#"
                  className="-mx-3 block rounded-lg px-3 py-2.5 text-base/7 font-semibold text-gray-900 hover:bg-gray-50"
                >
                  Log in
                </a>
              </div> */}
            </div>
          </div>
        </DialogPanel>
      </Dialog>
    </header>
  );
}
