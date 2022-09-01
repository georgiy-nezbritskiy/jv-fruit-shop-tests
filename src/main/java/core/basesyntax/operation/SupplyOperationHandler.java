package core.basesyntax.operation;

import core.basesyntax.model.Fruit;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.storage.Storage;

public class SupplyOperationHandler implements OperationHandler {
    @Override
    public void apply(FruitTransaction fruitTransaction) {
        Fruit currentFruit = fruitTransaction.getFruit();
        int currentRemainder = Storage.storage.get(currentFruit);
        Storage.storage.put(currentFruit, currentRemainder + fruitTransaction.getQuantity());
    }
}