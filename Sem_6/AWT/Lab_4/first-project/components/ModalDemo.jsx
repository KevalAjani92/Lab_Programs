"use client";
import React, { Fragment, useState } from "react";
import { Dialog, Transition } from "@headlessui/react";
import { XMarkIcon } from "@heroicons/react/24/outline";

export default function ModalDemo({ initialOpen = false }) {
  const [isOpen, setIsOpen] = useState(initialOpen);

  return (
    <>
      <button
        onClick={() => setIsOpen(true)}
        className="inline-flex items-center px-4 py-2 bg-blue-600 text-white rounded-md"
      >
        Open demo modal
      </button>

      <Transition show={isOpen} as={Fragment}>
        {/* Make sure Dialog is fixed and high z so it's in the top stacking context */}
        <Dialog
          as="div"
          className="fixed inset-0 z-9999 overflow-y-auto" // very high z just in case
          onClose={() => setIsOpen(false)}
        >
          <div className="min-h-screen px-4 text-center">
            {/* Backdrop — a bit lower z */}
            <Transition.Child
              enter="ease-out duration-200"
              enterFrom="opacity-0"
              enterTo="opacity-100"
              leave="ease-in duration-150"
              leaveFrom="opacity-100"
              leaveTo="opacity-0"
            >
              <div className="fixed inset-0 bg-black/40 z-40" aria-hidden="true" />
            </Transition.Child>

            {/* Centering trick — don't let it intercept events */}
            <span className="inline-block h-screen align-middle pointer-events-none" aria-hidden="true">
              &#8203;
            </span>

            {/* Panel — ensure it's positioned and has higher z than overlay */}
            <Transition.Child
              enter="ease-out duration-200"
              enterFrom="opacity-0 scale-95"
              enterTo="opacity-100 scale-100"
              leave="ease-in duration-150"
              leaveFrom="opacity-100 scale-100"
              leaveTo="opacity-0 scale-95"
            >
              <div className="inline-block w-full max-w-lg p-6 my-8 overflow-hidden text-left align-middle bg-white shadow-xl rounded-lg z-50 relative">
                <div className="flex items-start justify-between">
                  <Dialog.Title className="text-lg font-medium text-gray-900">
                    Demo Modal Title
                  </Dialog.Title>
                  <button
                    onClick={() => setIsOpen(false)}
                    aria-label="Close dialog"
                    className="rounded-md p-1 hover:bg-gray-100"
                  >
                    <XMarkIcon className="w-5 h-5 text-gray-600" />
                  </button>
                </div>

                <Dialog.Description className="mt-2 text-sm text-gray-500">
                  This is an example modal using Headless UI Dialog + Transition.
                </Dialog.Description>

                <div className="mt-6 flex justify-end gap-3">
                  <button onClick={() => setIsOpen(false)} className="px-4 py-2 bg-gray-200 rounded">
                    Cancel
                  </button>
                  <button
                    onClick={() => {
                      alert("Primary action executed");
                      setIsOpen(false);
                    }}
                    className="px-4 py-2 bg-blue-600 text-white rounded"
                  >
                    Confirm
                  </button>
                </div>
              </div>
            </Transition.Child>
          </div>
        </Dialog>
      </Transition>
    </>
  );
}
