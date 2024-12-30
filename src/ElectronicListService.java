import java.util.*;

public class ElectronicListService {


    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        Set<String> uniqueItems = new LinkedHashSet<>(Arrays.asList(electronicsItems.split(", ")));
        return new ArrayList<>(uniqueItems);
    }

    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        return itemList.indexOf(searchItem);
    }

    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        Iterator<String> iterator = itemList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(removeItem)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
            String electronicsItems = "TV, Computer, Refrigerator, TV";
        List<String> listItems = addElectronicsItemsToList(electronicsItems);
        System.out.println("Unique Items: " + listItems);

        String searchItem = "Computer";
        int index = searchElectronicItemInList(listItems, searchItem);
        System.out.println("Index of " + searchItem + ": " + index);

        String removeItem = "Computer";
        boolean isRemoved = removeElectronicsItemFromList(listItems, removeItem);
        System.out.println("Item removed: " + isRemoved);
        System.out.println("Updated List: " + listItems);
    }
}