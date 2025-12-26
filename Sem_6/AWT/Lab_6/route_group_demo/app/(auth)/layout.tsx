import Link from "next/link";
// import "../globals.css";

export default function AuthLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
      <div className="min-h-screen bg-gray-50 flex items-center justify-center py-12 px-4 sm:px-6 lg:px-8">
        <div className="max-w-4xl w-full bg-white shadow-lg rounded-2xl overflow-hidden grid grid-cols-1 md:grid-cols-2">
          {/* Left illustration / branding */}
          <div className="hidden md:flex items-center justify-center bg-gradient-to-br from-indigo-600 to-indigo-400 p-8">
            <div className="text-white text-center space-y-4 px-6">
              <h1 className="text-3xl font-semibold">Welcome back</h1>
              <p className="opacity-90">
                Sign in to continue to your account dashboard.
              </p>
            </div>
          </div>

          {/* Right: auth form area (children) */}
          <div className="p-8 sm:p-10">
            <div className="mx-auto w-full max-w-md">
              <div className="mb-6 text-center">
                <Link
                  href="/"
                  className="inline-block text-2xl font-bold text-indigo-600"
                >
                  YourApp
                </Link>
                <p className="text-sm text-gray-500 mt-2">
                  Secure access — sign in or create an account.
                </p>
              </div>

              <div>{children}</div>

              <div className="mt-6 text-center text-xs text-gray-400">
                © {new Date().getFullYear()} YourApp — All rights reserved.
              </div>
            </div>
          </div>
        </div>
      </div>
  );
}
