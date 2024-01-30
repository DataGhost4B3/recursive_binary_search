def bs(l,o,i=0,d=-1):
    #print('len=',len(l))
    co=int(len(l)/2-1 if len(l)&0 else (len(l)-1)/2)
    #print('co=',co)
    i+=co if d==-1 else co+1 if d else co-len(l)+1
    #print('i=',i)
    if l[co]==o:
        return i
    if l[co]>o:
        return bs(l[:co+1:],o,i,0)
    if l[co]<o:
        return bs(l[co+1::],o,i,1)


# same as the above function but the code is a tad bit more optimized.
def binsearch(arr: list, obj: float, i: int = 0, d: int = -1) -> int:
    #print(arr, '\n')
    cutoff = int(len(arr)/2-1 if len(arr)&0 else (len(arr)-1)/2)
    i += cutoff if d==-1 else cutoff+1 if d else cutoff-len(arr)+1
    if arr[cutoff] == obj:
        return i
    d = int(arr[cutoff] < obj)
    return binsearch(arr[cutoff+1::] if d else arr[:cutoff+1:], obj, i, d)
