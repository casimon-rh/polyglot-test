const funn = (n = 1, c = 0) =>
  [...Array(n * n * 2).keys()].forEach(x => {
    const b = n * (Math.floor(x / n) + 1);
    const p = b - x;
    const q = x - b + n + 1;
    if (Math.floor(x / n) % 2 > 0)
      process.stdout.write(`${q > c ? q : ' '}`);
    else
      process.stdout.write(`${p > c ? p : ' '}`);
    if ((x + 1) % (n * 2) === 0) {
      console.log('');
      c++;
    }
  });
funn(5);