# @param {Float} x
# @param {Integer} n
# @return {Float}

class Numeric
    def pow(n)
        return (n.negative? ? Float::NAN : 0.0) if self.abs < 0.0000001
        cur, sign, one = self, (n <=> 0), (self / self)
        return one if n.zero?
        n = n.abs
        ans = n.bit_length.times.inject(one) {|res, i| 
            res *= cur if n.odd?
            n >>= 1
            cur *= cur
            res
        }
        sign.positive? ? ans : one / ans
    end
end

def my_pow(x, n)
    x.pow(n)
end