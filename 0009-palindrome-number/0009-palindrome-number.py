class Solution:
    def isPalindrome(self, x: int) -> bool:
        i=x
        palin=0
        while i>0:
            temp=i%10
            palin=palin*10+temp
            i=i//10
        return (x==palin)
        