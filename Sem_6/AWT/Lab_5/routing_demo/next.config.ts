// next.config.ts
import { NextConfig } from "next";
import withFlowbiteReact from "flowbite-react/plugin/nextjs";

const nextConfig: NextConfig = {
  reactStrictMode: true,
  images: {
    // Prefer remotePatterns for fine-grained control (supports query params)
    remotePatterns: [
      {
        protocol: "https",
        hostname: "plus.unsplash.com",
        port: "",
        pathname: "/**", // allow all paths on plus.unsplash.com
      },
      // If you also use images.unsplash.com (other Unsplash URLs), add:
      {
        protocol: "https",
        hostname: "images.unsplash.com",
        port: "",
        pathname: "/**",
      },
    ],

    // alternatively you can use `domains` for simple host allow-list:
    // domains: ['plus.unsplash.com', 'images.unsplash.com'],
  },
};

export default withFlowbiteReact(nextConfig);