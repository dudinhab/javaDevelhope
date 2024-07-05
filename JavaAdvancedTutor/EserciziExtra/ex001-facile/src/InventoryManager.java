import java.util.HashSet;

public class InventoryManager {
    HashSet<AbstractItem> hashArticoli = new HashSet<AbstractItem>();

    public void addItem(AbstractItem item) {
        try {
            if (item == null) {
                throw new NullPointerException("Conteudo nullo não adicionado!");
            }
            this.hashArticoli.add(item);
            System.out.println("Add!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void removeItem(AbstractItem item) {
        hashArticoli.remove(item);
    }


    public void displayInventory(AbstractItem item) {
        hashArticoli.contains(item);
    }

    public void stampaInventory() {
        for (AbstractItem i : hashArticoli) {
            if (i != null) {
                System.out.println(i.displayDetails());
            }
        }
    }

}
