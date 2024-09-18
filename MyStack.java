import java.util.EmptyStackException;

public class MyStack
{
Integer [] stack;
int size;
public MyStack()
{
this(5);
}
public MyStack(int initCap)
{
stack= new Integer [initCap];
size = 0;
}
public boolean isEmpty()
{
return size == 0;
}
public int size()
{
return size;
}
public Integer peek()
{
if (isEmpty())
{
throw new EmptyStackException();
}
return stack[size-1];
}
public Integer pop()
{
if (isEmpty())
{
throw new EmptyStackException();
}
Integer top = stack[size-1];
//stack[size-1] = null;
size--;
return top;
}
public void push(Integer item)
{
if (size == stack.length) {
doubleCapacity();
}
stack[size++] = item;
}
private void doubleCapacity()
{
Integer [] newstack= new Integer[stack.length*2];
stack=newstack;
}
public String toString() {
String result = "[";
for (int i = 0; i < size; i++) {
result += stack[i];
if (i < size - 1) {
result += ", ";
}
}
return result + "]";
}
}
