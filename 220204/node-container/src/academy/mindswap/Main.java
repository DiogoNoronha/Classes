package academy.mindswap;

public class Main {

    public static void main(String[] args) {
        NodeContainer itSeemsAlmostLikeADynamicArray = new NodeContainer();

        itSeemsAlmostLikeADynamicArray.add("Hello");
        itSeemsAlmostLikeADynamicArray.add("World");
        itSeemsAlmostLikeADynamicArray.add("!");
        System.out.println(itSeemsAlmostLikeADynamicArray.size());
        System.out.println(itSeemsAlmostLikeADynamicArray.get(0));
        itSeemsAlmostLikeADynamicArray.remove("Hello");
        System.out.println(itSeemsAlmostLikeADynamicArray.size());
        System.out.println(itSeemsAlmostLikeADynamicArray.get(0));
    }



}

