// app/api/prime/[start]/[end]/route.ts

function isPrime(num: number): boolean {
  if (num < 2) return false;
  for (let i = 2; i * i <= num; i++) {
    if (num % i === 0) return false;
  }
  return true;
}

export async function GET(
  req: Request,
  { params }: { params: { start: string; end: string } }
) {
  const {start, end} = await params;
  
  const startNum = parseInt(start);
  const endNum = parseInt(end);

  const primes: number[] = [];

  for (let i = startNum; i <= endNum; i++) {
    if (isPrime(i)) primes.push(i);
  }

  return Response.json({
    start: startNum,
    end: endNum,
    primes,
  });
}
