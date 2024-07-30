package com.kaka.dev.product_crud_thymeleaf.initializer;

import com.kaka.dev.product_crud_thymeleaf.entity.Product;
import com.kaka.dev.product_crud_thymeleaf.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class LoadData implements CommandLineRunner {
    private final ProductService productService;

    public LoadData(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        var url1 = "https://samsungmobilepress.com/file/FC05AE750AD6EB0673D9E9D4C157D4FDCA91C0319D37B2827A4ACC850D3D124959298BB89A1D18EEB9531CE7B6BDB56BB43890C99A07EF46FFD865333FEC385C3A4ECDA52E32E217D32C2807BAAF403A9124FE24BD2AD9F141EA995A91D14E9095EC253173B6A26FE1DB745A586CC1ADDE7D6D440FA45C94CA365A5CF1A540E7";
        var des1 = "The Galaxy S24 redefines innovation in the smartphone world, combining cutting-edge technology with sleek design. Featuring a stunning 6.7-inch Dynamic AMOLED 2X display, it offers vibrant colors and a 120Hz refresh rate for an incredibly smooth experience. Powered by the latest Exynos 2300/Snapdragon 8 Gen 3 processor (depending on the region), the Galaxy S24 ensures lightning-fast performance and seamless multitasking.";

        var url2 = "https://images.macrumors.com/article-new/2023/09/iphone-15-pro-gray.jpg";
        var des2 = "The iPhone 15 continues Apple's tradition of excellence, offering a blend of powerful performance, advanced features, and sleek design. It boasts a 6.1-inch Super Retina XDR display with ProMotion technology, delivering stunning visuals and a buttery-smooth 120Hz refresh rate. Powered by the A17 Bionic chip, the iPhone 15 provides unmatched speed, efficiency, and AI capabilities.";

        var url3 = "https://powermaccenter.com/cdn/shop/files/iPhone_14_Pro_Max_Deep_Purple_PDP_Image_Position-1a__en-US_82df8721-1d88-40d2-8d9c-37820092a2a0.jpg?v=1705404256";
        var des3 = "The iPhone 14 Pro Max is the pinnacle of Apple’s smartphone innovation, combining premium design with cutting-edge technology. It features a stunning 6.7-inch Super Retina XDR display with ProMotion technology, offering an immersive visual experience with true-to-life colors and a silky-smooth 120Hz refresh rate. The Ceramic Shield front cover provides enhanced durability, making the iPhone 14 Pro Max as tough as it is beautiful.";

        var url4 = "https://i.pinimg.com/736x/0d/be/eb/0dbeeb010c9cf22fec89f6ef1cc699f0.jpg";

        var p1 = new Product(null, "Samsung Galaxy S24", BigDecimal.valueOf(1200), url1, des1);
        var p2 = new Product(null, "Iphone 15 Pro Max", BigDecimal.valueOf(1400), url2, des2);
        var p3 = new Product(null, "Iphone 14 Pro Max", BigDecimal.valueOf(1100), url3, des3);
        var p4 = new Product(null, "Iphone X", BigDecimal.valueOf(600), url4, "Have no description");

        var p5 = new Product(null, "Samsung Galaxy S10 Plus", BigDecimal.valueOf(210), "https://wefix.co.za/cdn/shop/products/Galaxy-S10-Plus-prism-White.png?v=1634634697", "#Note");

        productService.createProduct(p1);
        productService.createProduct(p2);
        productService.createProduct(p3);
        productService.createProduct(p4);
        productService.createProduct(p5);

    }
}
