#!/usr/bin/ruby
def funn(n)
  c = 0
  for x in 0...(n * n * 2)
    b = n * ((x / n).to_i + 1)
    p = b - x
    q = x - b + n + 1
    if (x / n).to_i % 2 > 0
      print q > c ? q : " "
    else
      print p > c ? p : " "
    end
    if (x + 1) % (n * 2) == 0
      puts ""
      c += 1
    end
  end
end

funn(5)
