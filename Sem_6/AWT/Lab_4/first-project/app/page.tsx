import Image from "next/image";
import Link from "next/link";

export default function Home() {
  return (
    <main className="flex justify-between items-center p-24">
      <h1 className="text-4xl text-center mt-4 border-2">Welcome to My Next.js App</h1>
      <Image
        src="globe.svg"
        alt="Sample Image"
        className="border-2"
        width={200}
        height={200}
      />
      <Link href={'/Demo'}>Click on This</Link>
      <Link href={'/Home'}>Click on This For Page</Link>
    </main>
  );
}
