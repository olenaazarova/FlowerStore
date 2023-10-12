package flower.store.stores;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Store {
    private List<Item> items;

    public List<Item> search(SearchFilter searchFilter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (searchFilter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }

}