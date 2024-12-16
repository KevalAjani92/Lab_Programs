using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Program-1
            //ArrayList StudentName = new ArrayList();
            //StudentName.Add("Keval");
            //StudentName.Add("Deep");
            //StudentName.Add("Nikunj");
            //StudentName.Add("Raj");
            //StudentName.Add("Kishan");
            //StudentName.Add("Jay");

            //StudentName.Remove("Nikunj");
            //StudentName.RemoveRange(1, 2);
            //StudentName.Clear();
            //foreach(object student  in StudentName)
            //{
            //    Console.WriteLine(student);
            //}

            //Program-2
            //List<string> StudentName = new List<string>();
            //StudentName.Add("Keval");
            //StudentName.Add("Deep");
            //StudentName.Add("Nikunj");
            //StudentName.Add("Raj");
            //StudentName.Add("Kishan");
            //StudentName.Add("Jay");

            //StudentName.Remove("Raj");
            //StudentName.RemoveRange(1, 3);
            //StudentName.Clear();

            //foreach (string student in StudentName)
            //{
            //    Console.WriteLine(student);
            //}

            //Program-3
            //Stack<int> stack = new Stack<int>();
            //stack.Push(1);
            //stack.Push(2);
            //stack.Push(3);
            //stack.Push(4);
            //stack.Push(5);
            //stack.Push(6);

            //Console.WriteLine("Popped Element : " + stack.Pop());
            //Console.WriteLine("Peeked Element : " + stack.Peek());
            //Console.WriteLine("Contain :" + stack.Contains(2));
            //stack.Clear();
            //foreach (object num in stack)
            //{
            //    Console.WriteLine(num);
            //}

            //Program-4
            //Queue q = new Queue();
            //q.Enqueue(1);
            //q.Enqueue(2);
            //q.Enqueue(3);
            //q.Enqueue(4);
            //q.Enqueue(5);
            //q.Enqueue(6);

            //Console.WriteLine("Dequeued Element : "+q.Dequeue());
            //Console.WriteLine("Peeked Element : "+q.Peek());
            //Console.WriteLine("Contain :" + q.Contains(2));
            ////q.Clear();
            //foreach (object item in q)
            //{
            //    Console.Write(item+" ");
            //}

            //Program-5
            //Dictionary<int,string> dic = new Dictionary<int,string>();
            //dic.Add(1, "Keval");
            //dic.Add(2, "Deep");
            //dic.Add(3, "Nikunj");
            //dic.Add(4, "Raj");
            //dic.Add(5, "Jay");
            //dic.Add(6, "Kishan");

            //dic.Remove(3);
            //Console.WriteLine(dic.ContainsKey(8));
            //Console.WriteLine(dic.ContainsValue("Keval"));
            //foreach (int i in dic.Keys)
            //{
            //    Console.WriteLine("Key : "+i+",Value : "+dic[i]);
            //}

            //Program-6
            Hashtable ht = new Hashtable();
            ht.Add("EId", 101);
            ht.Add("EName", "Keval");
            ht.Add("Job", "CEO");
            ht.Add("Salary", 25000);

            ht.Remove("Job");
            Console.WriteLine(ht.ContainsKey("Salary"));
            Console.WriteLine(ht.ContainsValue(20000));

            foreach (object key in ht.Keys)
            {
                Console.WriteLine(key+": " + ht[key]);
            }
        }
    }
}
