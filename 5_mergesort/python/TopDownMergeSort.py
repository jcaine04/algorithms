class TopDownMergeSort:

    @staticmethod
    def sort(a):
        _sort(a, 0, len(a) - 1)

    @staticmethod
    def _sort(a, lo, hi):
        if (hi <= lo):
            return
        
        mid = lo + (hi - lo) // 2
        _sort(a, lo, mid)
        _sort(a, mid + 1, hi)
        merge(a, lo, mid, hi)

    @staticmethod
    def merge(a, lo, mid, hi):
        i = lo
        j = mid
        aux = list()

        for k in range(hi + 1):
            aux[k] = a[k]

        for k in range(hi + 1):
            if i > mid:
                a[k] = aux[j]
                j += 1
            elif j > hi:
                a[k] = aux[i]
                i += 1
            elif less(aux[j], aux[i]):
                a[k] = aux[j]
                j += 1
            else:
                a[k] = aux[i]
                i

    @staticmethod
    def less(v, w):
        return v < w

    @staticmethod
    def show(a):
        print(a)

    