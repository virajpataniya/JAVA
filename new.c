#include <stdio.h>

int swap(int *a,int *b){
    *a=*a+*b;
    *b=*a-*b;
    *a=*a-*b;
    printf("value of a is %d ,value of b is %d\n",*a,*b);
    return 0;
}

int main(){
    int a=6,b=10;
    swap(&a,&b);
    //printf("Output is %d",a);
    //printf("Size of int is %zu bytes\n",sizeof(a));
    int num = 10;
int *ptr = &num;  // Pointer `ptr` holds the address of `num`
*ptr = 20;          // Updates `num` through pointer dereferencing
//printf("Value of num is %d\n",num);
    return 0;
}