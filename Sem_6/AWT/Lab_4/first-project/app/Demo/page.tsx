import ModalDemo from "@/components/ModalDemo";
export default function Page() {
  return (
    <main className="min-h-screen flex items-center justify-center p-8 bg-gray-50">
      <div>
        <h1 className="text-2xl font-bold mb-4">Headless UI Modal Demo</h1>
        <ModalDemo />
      </div>
    </main>
  );
}