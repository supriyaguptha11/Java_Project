package array;
// array could be of any type in this case it Alien type, size must be in positive integer only
class Alien
{
    int id;
    String name;
    String course;
}



public class LaunchArray3 {
    public static void main(String[] args) {
        Alien []arr = new Alien[3];
        arr[0] = new Alien();
        arr[1] = new Alien();
        arr[2] = new Alien();
// we can use for loop also instead writing all these

//        for(int i = 0; i < arr.length; i ++);
//        {
//            arr[i] = new Alien();
//         }

        arr[0].id = 1;
        arr[0].name = "Ram";
        arr[0].course = "Java";

        System.out.println(arr[0].id);
        System.out.println(arr[0].name);
        System.out.println(arr[0].course);

        System.out.println(arr[0]);  // if you use this it will print address of the object " array.Alien@5acf9800" instead of actual array


    }
}
