// app/contact/page.tsx
"use client";

import React, { useState } from "react";
import {
  EnvelopeIcon,
  PhoneIcon,
  MapPinIcon,
  CheckCircleIcon,
  ExclamationCircleIcon,
} from "@heroicons/react/24/outline";

type FormState = {
  name: string;
  email: string;
  phone?: string;
  subject: string;
  message: string;
  subscribe: boolean;
};

export default function ContactPage(): JSX.Element {
  const [form, setForm] = useState<FormState>({
    name: "",
    email: "",
    phone: "",
    subject: "",
    message: "",
    subscribe: false,
  });

  const [errors, setErrors] = useState<Partial<Record<keyof FormState, string>>>(
    {}
  );
  const [submitting, setSubmitting] = useState(false);
  const [status, setStatus] = useState<null | { ok: boolean; msg: string }>(
    null
  );

  function validate(): boolean {
    const e: typeof errors = {};
    if (!form.name.trim()) e.name = "Name is required";
    if (!form.email.trim()) e.email = "Email is required";
    else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(form.email))
      e.email = "Please enter a valid email";
    if (!form.subject.trim()) e.subject = "Subject is required";
    if (!form.message.trim() || form.message.trim().length < 10)
      e.message = "Message must be at least 10 characters";
    setErrors(e);
    return Object.keys(e).length === 0;
  }

  async function handleSubmit(e: React.FormEvent) {
    e.preventDefault();
    setStatus(null);

    if (!validate()) {
      window.scrollTo({ top: 0, behavior: "smooth" });
      return;
    }

    setSubmitting(true);
    try {
      // >>> Replace the below simulated request with a real API endpoint.
      // Example:
      // const res = await fetch('/api/contact', {
      //   method: 'POST',
      //   headers: { 'Content-Type': 'application/json' },
      //   body: JSON.stringify(form),
      // });
      // const data = await res.json();
      //
      // if (!res.ok) throw new Error(data?.message || 'Submission failed');

      // Simulated submit (for demo)
      await new Promise((r) => setTimeout(r, 800));

      setStatus({ ok: true, msg: "Thanks — your message has been sent!" });
      setForm({
        name: "",
        email: "",
        phone: "",
        subject: "",
        message: "",
        subscribe: false,
      });
      setErrors({});
    } catch (err: any) {
      setStatus({
        ok: false,
        msg:
          err?.message ??
          "Something went wrong. Please try again later or contact support.",
      });
    } finally {
      setSubmitting(false);
    }
  }

  return (
    <main className="flex-grow bg-gray-50 py-12">
      <div className="mx-auto max-w-4xl px-4 sm:px-6 lg:px-8">
        <div className="grid grid-cols-1 gap-8 lg:grid-cols-2">
          {/* Contact info panel */}
          <div className="rounded-xl bg-white p-6 shadow">
            <h1 className="text-2xl font-bold text-gray-900">Contact us</h1>
            <p className="mt-2 text-sm text-gray-600">
              We're here to help. Fill out the form and we'll get back to you
              within 1 business day.
            </p>

            <div className="mt-6 space-y-4">
              <div className="flex items-start gap-3">
                <div className="rounded-md bg-indigo-50 p-2">
                  <EnvelopeIcon className="h-6 w-6 text-indigo-600" />
                </div>
                <div>
                  <h3 className="text-sm font-semibold text-gray-900">
                    Email
                  </h3>
                  <p className="text-sm text-gray-600">support@yourstore.com</p>
                </div>
              </div>

              <div className="flex items-start gap-3">
                <div className="rounded-md bg-indigo-50 p-2">
                  <PhoneIcon className="h-6 w-6 text-indigo-600" />
                </div>
                <div>
                  <h3 className="text-sm font-semibold text-gray-900">
                    Phone
                  </h3>
                  <p className="text-sm text-gray-600">+1 (555) 123-4567</p>
                </div>
              </div>

              <div className="flex items-start gap-3">
                <div className="rounded-md bg-indigo-50 p-2">
                  <MapPinIcon className="h-6 w-6 text-indigo-600" />
                </div>
                <div>
                  <h3 className="text-sm font-semibold text-gray-900">Head office</h3>
                  <p className="text-sm text-gray-600">
                    123 Market Street, San Francisco, CA
                  </p>
                </div>
              </div>
            </div>

            <div className="mt-6 border-t pt-6">
              <p className="text-sm text-gray-500">
                For partnership or press inquiries, please email{" "}
                <a className="font-medium text-indigo-600" href="mailto:press@yourstore.com">
                  press@yourstore.com
                </a>
                .
              </p>
            </div>
          </div>

          {/* Form panel */}
          <div className="rounded-xl bg-white p-6 shadow">
            {/* Status banner */}
            {status && (
              <div
                role="status"
                className={`mb-4 flex items-center gap-3 rounded-md px-4 py-3 ${
                  status.ok ? "bg-green-50 text-green-800" : "bg-red-50 text-red-800"
                }`}
              >
                {status.ok ? (
                  <CheckCircleIcon className="h-5 w-5 text-green-600" />
                ) : (
                  <ExclamationCircleIcon className="h-5 w-5 text-red-600" />
                )}
                <p className="text-sm">{status.msg}</p>
              </div>
            )}

            <form onSubmit={handleSubmit} noValidate>
              <div className="grid grid-cols-1 gap-4 sm:grid-cols-2">
                <label className="flex w-full flex-col">
                  <span className="text-sm font-medium text-gray-700">Name</span>
                  <input
                    type="text"
                    value={form.name}
                    onChange={(e) => setForm({ ...form, name: e.target.value })}
                    className={`mt-1 block w-full rounded-md border px-3 py-2 text-sm shadow-sm focus:outline-none focus:ring-1 ${
                      errors.name ? "border-red-300 focus:ring-red-500" : "border-gray-200 focus:ring-indigo-500"
                    }`}
                    aria-invalid={!!errors.name}
                    aria-describedby={errors.name ? "name-error" : undefined}
                    placeholder="Your full name"
                  />
                  {errors.name && (
                    <p id="name-error" className="mt-1 text-xs text-red-600">
                      {errors.name}
                    </p>
                  )}
                </label>

                <label className="flex w-full flex-col">
                  <span className="text-sm font-medium text-gray-700">Email</span>
                  <input
                    type="email"
                    value={form.email}
                    onChange={(e) => setForm({ ...form, email: e.target.value })}
                    className={`mt-1 block w-full rounded-md border px-3 py-2 text-sm shadow-sm focus:outline-none focus:ring-1 ${
                      errors.email ? "border-red-300 focus:ring-red-500" : "border-gray-200 focus:ring-indigo-500"
                    }`}
                    aria-invalid={!!errors.email}
                    aria-describedby={errors.email ? "email-error" : undefined}
                    placeholder="you@company.com"
                  />
                  {errors.email && (
                    <p id="email-error" className="mt-1 text-xs text-red-600">
                      {errors.email}
                    </p>
                  )}
                </label>
              </div>

              <div className="mt-4">
                <label className="flex w-full flex-col">
                  <span className="text-sm font-medium text-gray-700">Phone (optional)</span>
                  <input
                    type="tel"
                    value={form.phone}
                    onChange={(e) => setForm({ ...form, phone: e.target.value })}
                    className="mt-1 block w-full rounded-md border border-gray-200 px-3 py-2 text-sm shadow-sm focus:outline-none focus:ring-1 focus:ring-indigo-500"
                    placeholder="+1 (555) 123-4567"
                  />
                </label>
              </div>

              <div className="mt-4">
                <label className="flex w-full flex-col">
                  <span className="text-sm font-medium text-gray-700">Subject</span>
                  <input
                    type="text"
                    value={form.subject}
                    onChange={(e) => setForm({ ...form, subject: e.target.value })}
                    className={`mt-1 block w-full rounded-md border px-3 py-2 text-sm shadow-sm focus:outline-none focus:ring-1 ${
                      errors.subject ? "border-red-300 focus:ring-red-500" : "border-gray-200 focus:ring-indigo-500"
                    }`}
                    aria-invalid={!!errors.subject}
                    aria-describedby={errors.subject ? "subject-error" : undefined}
                    placeholder="What is this about?"
                  />
                  {errors.subject && (
                    <p id="subject-error" className="mt-1 text-xs text-red-600">
                      {errors.subject}
                    </p>
                  )}
                </label>
              </div>

              <div className="mt-4">
                <label className="flex w-full flex-col">
                  <span className="text-sm font-medium text-gray-700">Message</span>
                  <textarea
                    value={form.message}
                    onChange={(e) => setForm({ ...form, message: e.target.value })}
                    rows={6}
                    className={`mt-1 block w-full rounded-md border px-3 py-2 text-sm shadow-sm focus:outline-none focus:ring-1 ${
                      errors.message ? "border-red-300 focus:ring-red-500" : "border-gray-200 focus:ring-indigo-500"
                    }`}
                    aria-invalid={!!errors.message}
                    aria-describedby={errors.message ? "message-error" : undefined}
                    placeholder="Tell us more about your request..."
                  />
                  {errors.message && (
                    <p id="message-error" className="mt-1 text-xs text-red-600">
                      {errors.message}
                    </p>
                  )}
                </label>
              </div>

              <div className="mt-4 flex items-center gap-3">
                <label className="inline-flex items-center gap-2 text-sm text-gray-700">
                  <input
                    type="checkbox"
                    checked={form.subscribe}
                    onChange={(e) => setForm({ ...form, subscribe: e.target.checked })}
                    className="h-4 w-4 rounded border-gray-300 text-indigo-600 focus:ring-indigo-500"
                  />
                  Subscribe to newsletter
                </label>
              </div>

              <div className="mt-6 flex items-center justify-between">
                <div className="text-sm text-gray-500">
                  <span className="font-medium text-gray-700">Need faster support?</span> Call{" "}
                  <span className="font-semibold text-gray-900">+1 (555) 123-4567</span>
                </div>
                <div>
                  <button
                    type="submit"
                    disabled={submitting}
                    className={`inline-flex items-center gap-2 rounded-md px-4 py-2 text-sm font-semibold text-white ${
                      submitting ? "bg-indigo-300" : "bg-indigo-600 hover:bg-indigo-700"
                    } focus:outline-none focus:ring-2 focus:ring-indigo-500`}
                  >
                    {submitting ? "Sending..." : "Send message"}
                  </button>
                </div>
              </div>
            </form>

            <p className="mt-4 text-xs text-gray-400">
              By contacting us you agree to our{" "}
              <a className="text-indigo-600" href="/privacy">
                privacy policy
              </a>
              .
            </p>
          </div>
        </div>
      </div>
    </main>
  );
}
