// Tristan Chapman
// Creating class object 2.3pt1
// Mr gross Software and Programming2024
  
 { 
  
    // Announces/declares the string.
    
    String name = "Horsemom"; 
  
    
    public static void main(String[] args) 
    { 
        
        
        
        GFG obj = new GFG(); 
  
        // This prints the object name out.
        System.out.println(obj.name); 
    } 
}
    
void printVector(const vector<int>& arr) { //Printing vector section
    for (int num : arr)
        cout << " " << num;
}

int main() {
    vector<int> arr = { 64, 34, 25, 12, 22, 11, 90 };
    bubbleSort(arr);
    cout << "Sorted array: \n";
    printVector(arr);
    return 0;
}
class Horse {
  
  String breed = "Shire";
  int age = 4;           // Description of an animal.
  String color = "Black";
}

public class Main {
  public static void main(String[] args) {
    // Object for the Horse class.
    Horse obj = new Horse();

    
    System.out.println("Before modifying:"); // Printing before modifying everything.
    System.out.println(obj.breed);
    System.out.println(obj.age);
    System.out.println(obj.color);

    
    obj.breed = "Arabian Horse";
    obj.age = 5;
    obj.color = "white";

    // Printing everything
    System.out.println("\nAfter modifying:");
    System.out.println(obj.breed);
    System.out.println(obj.age);
    System.out.println(obj.color);
  }
}





