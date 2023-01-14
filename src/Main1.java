import common.AppView;
import common.PageLoop;
import data.data_source.cart.CartDataSource;
import data.data_source.cart.MockCartDataSourceImpl;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.catalog.MockCatalogDataSourceImpl;
import data.data_source.order.MockOrderDataSourceImpl;
import data.data_source.order.OrderDataSource;
import data.service.ShopService;
import view.*;

import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args) {
        CartDataSource cartDataSource = new MockCartDataSourceImpl();
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl();
        OrderDataSource orderDataSource = new MockOrderDataSourceImpl();
        ShopService shopService = new ShopService(catalogDataSource, cartDataSource, orderDataSource);

        AppView addToCartView = new AddToCartView(shopService);

        ArrayList<AppView> catalogChildren = new ArrayList<>();
        catalogChildren.add(addToCartView);
        AppView catalogView = new CatalogView(shopService, catalogChildren);

        AppView cartView = new CartView(shopService);
        AppView orderView = new OrderView(shopService);

        ArrayList<AppView> mainChildren = new ArrayList<>();
        mainChildren.add(catalogView);
        mainChildren.add(cartView);
        mainChildren.add(orderView);
        AppView mainView = new MainView(mainChildren);

        new PageLoop(mainView).run();



    }
}



