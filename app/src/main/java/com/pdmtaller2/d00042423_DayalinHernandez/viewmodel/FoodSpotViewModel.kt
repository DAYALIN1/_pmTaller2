package com.pdmtaller2.d00042423_DayalinHernandez.viewmodel


import androidx.lifecycle.ViewModel
import com.pdmtaller2.d00042423_DayalinHernandez.model.Dish
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.pdmtaller2.d00042423_DayalinHernandez.model.Restaurant
import kotlin.String

class FoodSpotViewModel : ViewModel() {
    fun getRestaurantById(id: String): Restaurant? {
        return restaurants.find { it.id.toString() == id }
    }


    private val _selectedCategory = MutableStateFlow<String?>(null)
    val selectedCategory: StateFlow<String?> = _selectedCategory

    private val _selectedDishes = MutableStateFlow<List<Dish>>(emptyList())
    val selectedDishes: StateFlow<List<Dish>> = _selectedDishes

    fun selectCategory(category: String) {
        _selectedCategory.value = category
        val restaurantsInCategory = _restaurantsByCategory.value[category].orEmpty()
        _selectedDishes.value = restaurantsInCategory.flatMap { it.menu }
    }


    private val restaurants = listOf(
        Restaurant(
            id = 4,
            name = "Rápido y Rico",
            description = "La comida es muy buena",
            imgURL = "https://thafd.bing.com/th/id/OIP.W1GZhCMpabz6TtqCu9dESgHaE8?rs=1&pid=ImgDetMain",
            location = "Municipio Teresa Gálvez 37 - Montgomery, Cbr / 99483",
            categories = listOf("Comida Rapida"),
            menu = listOf(
                Dish(
                    id = "4.1",
                    name ="Hamburguesa Clasica",
                    description = "una hamburguesa normal",
                    imgURL = "https://thafd.bing.com/th/id/OIP.xpHtN8nOMEDD69KJLoiHDAHaHa?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "4.2",
                    name ="papas fritas",
                    description = "papas muy ricas",
                    imgURL = "https://media.airedesantafe.com.ar/p/54d2b1876b8c0b6bd47448c2392de0c6/adjuntos/268/imagenes/003/670/0003670396/1200x0/smart/imagepng.png"
                ),
                Dish(
                    id = "4.3",
                    name ="papas con Queso",
                    description = "las papas tinene queso yeii",
                    imgURL = "https://tomaleche.com/wp-content/uploads/sites/2/2021/06/GettyImages-921916164-scaled.jpg"
                )
            )
        ),        Restaurant(
            id = 5,
            name = "Sabor Express",
            description = "platillos muy buenos",
            imgURL = "https://gerente.com/co/wp-content/uploads/sites/16/2017/09/restaurantes.jpg",
            location = "Camino Cristián 1 - Kenner, Vas / 19273",
            categories = listOf("Comida Rapida"),
            menu = listOf(
                Dish(
                    id = "5.1",
                    name ="Nuggets de Pollo",
                    description = "uNuggets de Pollo deliciosos",
                    imgURL = "https://thafd.bing.com/th/id/OIP.po0eix6P3T4d0W7lPyPbwgHaE8?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "5.2",
                    name ="Sándwich de Pollo",
                    description = "Sándwich de Pollo, muy buenas",
                    imgURL = "https://thafd.bing.com/th/id/OIP.cty_hYeQ53NMyD96yz2VNAHaE7?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "5.3",
                    name ="Aros de Cebolla",
                    description = "Aros de Cebolla, crujientes",
                    imgURL = "https://th.bing.com/th/id/R.e4361e5f01fee8e3cc3facc78cdb27f3?rik=1DQ2qOTELBKV0w&pid=ImgRaw&r=0"
                )
            )
        ),        Restaurant(
            id = 6,
            name = "Fast Bite",
            description = "amaras este restaurante",
            imgURL = "https://www.imagelato.com/images/article-image-fast-food-restaurant-decoration-5c95ba39.jpg",
            location = "Glorieta Antonia Zepeda 28 - Tigard, Cbr / 10535",
            categories = listOf("Comida Rapida"),
            menu = listOf(
                Dish(
                    id = "6.1",
                    name ="Doble Cheeseburger",
                    description = "Doble Cheeseburger deliciosos",
                    imgURL = "https://thafd.bing.com/th/id/OIP.XULephKEEE5Obq11QTSTiQHaE8?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "6.2",
                    name ="Pollo Frito",
                    description = "Pollo Frito, muy buenas",
                    imgURL = "https://thafd.bing.com/th/id/OIP.HFklaO-fv9aWVCUdQ8annQHaE8?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "6.3",
                    name ="Papas con Queso",
                    description = "Papas con Queso, crujientes",
                    imgURL = "https://thafd.bing.com/th/id/OIP.JNRKgD_9GjxZGbqtiC3mVgHaHa?rs=1&pid=ImgDetMain"
                )
            )
        ),
        Restaurant(
            id = 1,
            name = "Taco Fiesta",
            description = "Los mejores tacos de la ciudad.",
            imgURL = "https://th.bing.com/th/id/R.43b44dd05e6c6d2a53d9814559456e17?rik=UUJ%2fGnVhb%2bcJ0g&pid=ImgRaw&r=0",
            location = "Centro",
            categories = listOf("Comida Mexicana"),
            menu = listOf(
                Dish(
                 id = "1.1",
                 name ="Taco de Asada",
                 description = "Carne asada con cebolla",
                imgURL = "https://img.taste.com.au/R_dRdL7V/taste/2022/09/healthy-tacos-recipe-181113-1.jpg"
            ),
               Dish(
                id = "1.2",
                name ="chimichanga",
                description = "chimichanga mixta",
                imgURL = "https://thafd.bing.com/th/id/OIP.q7hrEue6fewHt8IrI-BGkAHaEc?rs=1&pid=ImgDetMain"
               ),
                Dish(
                    id = "1.3",
                    name ="torta",
                    description = "torta de pollo",
                    imgURL = "https://th.bing.com/th/id/R.4a2f1882c821a0f6f96b4f9bd29a7153?rik=QoOJGYQFVXDyZA&pid=ImgRaw&r=0"
                )
            )
        ),
        Restaurant(
            id = 7,
            name = "El Buen Taco",
            description = "El Buen Taco, es rico",
            imgURL = "https://th.bing.com/th/id/R.0213229e8425a5a078c220b77911bfa7?rik=GzZ8kUekXYc4eg&pid=ImgRaw&r=0",
            location = "Jardines Sergio Menéndez 40 - Charlottesville, Ext / 27283",
            categories = listOf("Comida Mexicana"),
            menu = listOf(
                Dish(
                    id = "7.1",
                    name ="Tacos al Pastor",
                    description = "Tacos al Pastor deliciosos",
                    imgURL = "https://comidamexicana.co/wp-content/uploads/2019/07/receta-de-tacos-al-pastor.jpg"
                ),
                Dish(
                    id = "7.2",
                    name ="Quesadillas",
                    description = "Quesadillas riquisimas",
                    imgURL = "https://thafd.bing.com/th/id/OIP.N-1vv5U5AGw92voRVnYzOQHaEs?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "7.3",
                    name ="Nachos con Guacamole",
                    description = "Nachos con Guacamole, son muy ricos",
                    imgURL = "https://thafd.bing.com/th/id/OIP.Sx9S7p6_hCdsfzONmUyMgQHaEo?rs=1&pid=ImgDetMain"
                )
            )
        ),
        Restaurant(
            id = 8,
            name = "Sabores de México",
            description = "Mexico cerca de ti",
            imgURL = "https://thafd.bing.com/th/id/OIP.GF-tPZlefw89l346HxTf6wHaFl?rs=1&pid=ImgDetMain",
            location = "Rincón Carlos Arellano, 9 - Salt Lake City, Nav / 69736",
            categories = listOf("Comida Mexicana"),
            menu = listOf(
                Dish(
                    id = "8.1",
                    name ="Enchiladas",
                    description = "las favoritas del local",
                    imgURL = "https://thafd.bing.com/th/id/OIP.O-AgqEQmQUlyPHdsSy2VZgHaHa?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "8.2",
                    name ="Tostadas",
                    description = "Tostadas crocantes",
                    imgURL = "https://thafd.bing.com/th/id/OIP.0sSz4dLUeamlCrJIbBR7aQHaE8?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "8.3",
                    name ="Burrito de Res",
                    description = "Burrito de Res riqco",
                    imgURL = "https://th.bing.com/th/id/R.9d738baf462e9133e146599280619ee5?rik=3oK75GWweUO8Mg&pid=ImgRaw&r=0"
                )
            )
        ),
        Restaurant(
            id = 2,
            name = "pizzeria el buen gusto",
            description = "Pizza real de italia.",
            imgURL = "https://thafd.bing.com/th/id/OIP.QelyIkdxBoZbt6dYwAHE9QHaEe?rs=1&pid=ImgDetMain",
            location = "San Benito",
            categories = listOf("Comida Italiana"),
            menu = listOf(
                Dish(
                    id = "2.1",
                    name ="Spaghetti Boloñesa",
                    description = "Spaghetti Boloñesa muy buena",
                    imgURL = "https://th.bing.com/th/id/R.78ecba7c2b54053d7a41f7eddbf2aff3?rik=L3pnM5lAhqF%2bYw&riu=http%3a%2f%2fwww.unileverfoodsolutions.com.co%2fdam%2fglobal-ufs%2fmcos%2fNOLA%2fcalcmenu%2frecipes%2fcol-recipies%2ffruco-tomate-cocineros%2fBOLO%c3%91ESA+1200x709.png&ehk=NzGrbytVCdjl2NYbORl83BiPqnWIdwOP2wWJUJPuw4E%3d&risl=&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "2.2",
                    name ="Lasagna de Carne",
                    description = "Lasagna de Carne, esta rica",
                    imgURL = "https://assets.unileversolutions.com/recipes-v2/232080.jpg"
                ),
                Dish(
                    id = "2.3",
                    name ="tRaviolis de Queso",
                    description = "Raviolis de Queso, el queso es muy rico",
                    imgURL = "https://th.bing.com/th/id/R.cd166ffdebf1f6d7bcc1d5921103b015?rik=%2fnw0yqkc8gRV5g&pid=ImgRaw&r=0"
                )
            )
        ),
        Restaurant(
            id = 3,
            name = "Pizza Roma",
            description = "Pizza al estilo italiano.",
            imgURL = "https://welovebudapest.com/i/f7/pizza-me-gyar-uzlet-200213-szabo-gabor-035.exact1980w.jpg",
            location = "Rampa Sara Segura, 41 - Brentwood, Ext / 09005",
            categories = listOf("Comida Italiana"),
            menu = listOf(
                Dish(
                    id = "3.1",
                    name ="Pizza Margarita",
                    description = "Pizza Margarita, rica",
                    imgURL = "https://thepizzasecret.com/wp-content/uploads/2023/05/20220211142754-margherita-9920.jpg"
                ),
                Dish(
                    id = "3.2",
                    name ="Penne Alfredo",
                    description = "Penne Alfredo, es muy buena",
                    imgURL = "https://th.bing.com/th/id/R.79c46d6410e561600f27d78da17c0a13?rik=g5Yi1UEF3XZkxQ&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "3.3",
                    name ="Risotto de Champiñones",
                    description = "Risotto de Champiñones, es delicioso",
                    imgURL = "https://thafd.bing.com/th/id/OIP.2bRYYGJY_U-u8QvHBgU_lgHaEo?rs=1&pid=ImgDetMain"
                )
            )
        ),
        Restaurant(
            id = 9,
            name = "Sabor Italiano",
            description = "prueba el sabor italiano",
            imgURL = "https://mosticonicrestaurants.com/wp-content/uploads/2022/08/restaurante-espanol-1.jpg",
            location = "Calle Luz Camarillo 8 - Homestead, Gal / 51560",
            categories = listOf("Comida Italiana"),
            menu = listOf(
                Dish(
                    id = "9.1",
                    name ="Fettuccine Carbonara",
                    description = "Fettuccine Carbonara, rica",
                    imgURL = "https://thepizzasecret.com/wp-content/uploads/2023/05/20220211142754-margherita-9920.jpg"
                ),
                Dish(
                    id = "9.2",
                    name ="Calzone",
                    description = "Calzone, es muy buena",
                    imgURL = "https://th.bing.com/th/id/R.df28f426ee5d1edf513eb802cb5ccf31?rik=x%2fHxu7qgAB6%2fGg&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "9.3",
                    name ="Bruschetta",
                    description = "Bruschetta, es delicioso",
                    imgURL = "https://th.bing.com/th/id/R.e3e68342b530c8ce81eafc5366b5c024?rik=4zAzpgjgqBQNFA&pid=ImgRaw&r=0"
                )
            )
        ),
        Restaurant(
            id = 10,
            name = "Sushi Zen",
            description = "Restaurante contemporáneo especializado en sushi de autor",
            imgURL = "https://adiariocr.com/wp-content/uploads/WhatsApp-Image-2023-11-28-at-20.00.26.jpeg",
            location = "Arrabal Victoria Jasso, 74 - Monroe, Ext / 05967",
            categories = listOf("Comida Asiática"),
            menu = listOf(
                Dish(
                    id = "10.1",
                    name ="Dragon Roll",
                    description = "Rollo de sushi relleno de camarón tempura, cubierto con aguacate y salsa unagi.",
                    imgURL = "https://th.bing.com/th/id/R.d34a0dcd7839440dd341f514dd207532?rik=zKZqh4XMH3WgYw&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "10.2",
                    name ="Sopa Miso",
                    description = " Caldo japonés con tofu, algas wakame y cebollín",
                    imgURL = "https://thafd.bing.com/th/id/OIP.BmBbk8hpkeTkFPDTwpkxngHaEy?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "10.3",
                    name ="Tonkatsu Ramen",
                    description = " Fideos en caldo espeso de cerdo, con huevo marinado, cerdo chashu y alga nori",
                    imgURL = "https://glebekitchen.com/wp-content/uploads/2017/04/tonkotsuramenfront.jpg"
                )
            )
        ),
        Restaurant(
            id = 11,
            name = "Wok Express",
            description = "Comida asiática cocinada al momento en wok",
            imgURL = "https://www.brewer-world.com/wp-content/uploads/2022/07/BLR_Brewing-Header-768x538.jpg",
            location = "Carretera Víctor Betancourt, 99 - Pine Bluff, Com / 69215",
            categories = listOf("Comida Asiática"),
            menu = listOf(
                Dish(
                    id = "11.1",
                    name ="Pollo Kung Pao",
                    description = "Dados de pollo salteados con cacahuates, chiles secos y verduras.",
                    imgURL = "https://th.bing.com/th/id/R.7a5adac79e43bedd7f2f24278f848f53?rik=7ecz89CmGwPw0A&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "11.2",
                    name ="Chow Mein de Camarones",
                    description = "Fideos salteados con camarones y vegetales en salsa de ostras.",
                    imgURL = "https://thafd.bing.com/th/id/OIP.C9_n8iC-FejH4jdpRQQSZgAAAA?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "11.3",
                    name ="Arroz Frito Tailandés",
                    description = "Arroz jazmín frito con huevo, verduras y salsa de pescado.",
                    imgURL = "https://thafd.bing.com/th/id/OIP.jy53cqgmqCAnVJ00gyE1xAHaGW?rs=1&pid=ImgDetMain"
                )
            )
        ),
        Restaurant(
            id = 12,
            name = " Hanami",
            description = "Restaurante fusión coreano-japonés",
            imgURL = "https://thafd.bing.com/th/id/OIP.mPNAYVqJNGrRMUjyVYOH0wHaE8?w=900&h=600&rs=1&pid=ImgDetMain",
            location = "Poblado Francisco Garica, 10 - Carolina, Ast / 01613",
            categories = listOf("Comida Asiática"),
            menu = listOf(
                Dish(
                    id = "12.1",
                    name ="Gyozas",
                    description = "Empanadillas japonesas rellenas de cerdo, doradas y servidas con salsa ponzu",
                    imgURL = "https://th.bing.com/th/id/R.87541ee4abfca1fbb7439c0927675675?rik=p7XMWM2DQOAhvQ&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "12.2",
                    name ="Bibimbap",
                    description = "Tazón de arroz con vegetales, carne, huevo y pasta de chile gochujang.",
                    imgURL = "https://thafd.bing.com/th/id/OIP.XQIww0eJrl8VSqLyJUCWeAHaE8?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "12.3",
                    name ="Yakitori",
                    description = "Brochetas de pollo glaseadas en salsa dulce de soya.",
                    imgURL = "https://th.bing.com/th/id/R.7462582aad1e9bebc7f537196392e435?rik=M1g%2bvH580n3%2bcA&pid=ImgRaw&r=0"
                )
            )
        ),
        Restaurant(
            id = 13,
            name = " Green Bowl",
            description = "Especialistas en bowls, smoothies ",
            imgURL = "https://images-cdn.easyweddings.com.au/S3/prod-ew-image-global-v2/Live/ImageUploader/tazio-supplierprofilelive-photo-149402a0-3ec9-413b-a1fb-40da0eaf0c63.jpg?quality=80&format=jpg&mode=crop&scale=both&width=900&height=700",
            location = "Jardines Luis, 53 - Meridian, Leo / 14986",
            categories = listOf("Comida Saludable"),
            menu = listOf(
                Dish(
                    id = "13.1",
                    name ="Ensalada de Quinoa y Aguacate",
                    description = "Mezcla de quinoa, garbanzos, aguacate y aderezo cítrico",
                    imgURL = "https://th.bing.com/th/id/R.cd7562bd5edbc0e4ddcabf1dda5f1b36?rik=uEEopWV7NMOJtA&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "13.2",
                    name ="Wrap de Pollo al Grill",
                    description = "Tortilla integral con pollo, hummus y vegetales crujientes.",
                    imgURL = "https://th.bing.com/th/id/R.2a8103ed2d1960447456fcc4f7bef886?rik=RWgTGk8w9y39Cw&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "13.3",
                    name ="Smoothie Verde",
                    description = "Batido detox con espinaca, manzana, plátano y leche de almendra",
                    imgURL = "https://th.bing.com/th/id/R.6577b0432c2fd43b2addb723ded8a103?rik=4bI%2bMPa4SYT%2bpQ&pid=ImgRaw&r=0"
                )
            )
        ),
        Restaurant(
            id = 14,
            name = "Vital Kitchen",
            description = "Cocina consciente con ingredientes naturales",
            imgURL = "https://thafd.bing.com/th/id/OIP.8q956ajX4HI7tNmJmVh_GAAAAA?w=400&h=229&rs=1&pid=ImgDetMain",
            location = "Masía Agustín 7 - Sanford, Cbr / 93013",
            categories = listOf("Comida Saludable"),
            menu = listOf(
                Dish(
                    id = "14.1",
                    name ="Bowl Vegano",
                    description = "Arroz integral con tofu, brócoli y encurtidos",
                    imgURL = "https://thafd.bing.com/th/id/OIP.jhLfGnBby4SCR3TNADLYUwHaHa?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "14.2",
                    name ="Crema de Calabaza",
                    description = "Sopa suave con notas de cúrcuma y jengibre.",
                    imgURL = "https://thafd.bing.com/th/id/OIP.EBBePo2PloYxH471Fb_R8AHaEk?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "14.3",
                    name ="Tostadas de Hummus",
                    description = " Pan integral con hummus casero, tomate seco y semillas",
                    imgURL = "https://thafd.bing.com/th/id/OIP.Bbtssv1Cc2MQgxu3PFCsogHaEk?rs=1&pid=ImgDetMain"
                )
            )
        ),
        Restaurant(
            id = 15,
            name = "Nature Bites",
            description = "Desayunos, brunch y snacks nutritivos ",
            imgURL = "https://thafd.bing.com/th/id/OIP.ouMfS2IJ8FClTqejxtqs8QHaE8?w=1200&h=800&rs=1&pid=ImgDetMain",
            location = "Huerta Ernesto Sanabria 2 - Coral Springs, Ast / 82851",
            categories = listOf("Comida Saludable"),
            menu = listOf(
                Dish(
                    id = "15.1",
                    name ="Chía Pudding",
                    description = " Postre ligero con leche de coco, frutas del bosque y miel natural",
                    imgURL = "https://thafd.bing.com/th/id/OIP.Sm2XNNihCVLkDtexTPxx7QHaLH?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "15.2",
                    name ="Omelette de Claras",
                    description = " Claras batidas con vegetales frescos y cocidas al punto",
                    imgURL = "https://storage.googleapis.com/avena-recipes/agtzfmF2ZW5hLWJvdHIZCxIMSW50ZXJjb21Vc2VyGICAkKyViMwKDA/26-04-2022/1651004667244.jpeg"
                ),
                Dish(
                    id = "15.3",
                    name ="Granola Bowl",
                    description = "Yogur natural con granola artesanal y frutas frescas",
                    imgURL = "https://th.bing.com/th/id/R.9a5d8131e452fb7a837ac03e2f26af1c?rik=wc31qV3F5TGcFA&pid=ImgRaw&r=0"
                )
            )
        ),
        Restaurant(
            id = 16,
            name = "Dulce Tentación",
            description = "Pastelería gourmet",
            imgURL = "https://thafd.bing.com/th/id/OIP.jCE0AVbwdrFhzfx4Sek1jQHaFj?rs=1&pid=ImgDetMain",
            location = "Aldea Claudia Meléndez, 08 - Tigard, Bal / 37135",
            categories = listOf("Postres y Dulces"),
            menu = listOf(
                Dish(
                    id = "16.1",
                    name ="Tarta de Frutas",
                    description = " Base crujiente con crema pastelera y frutas frescas",
                    imgURL = "https://www.recetasderechupete.com/wp-content/uploads/2019/07/Tarta-de-crema-y-frutas-525x360.jpg"
                ),
                Dish(
                    id = "16.2",
                    name ="Brownie de Chocolate",
                    description = " Denso y húmedo, con nueces y glaseado de chocolate",
                    imgURL = "https://th.bing.com/th/id/R.a3759dddd2b43302a65b54ce12f57762?rik=%2bijZTrYORiWhpQ&riu=http%3a%2f%2fkitchenfair.com.mx%2fwp-content%2fuploads%2f2017%2f07%2freceta_brownies_1280x854.jpg&ehk=J%2bi8g0Ksb4JUB7%2fHeNxMR8GD1ljt1bNlIsyDbC6Sfp0%3d&risl=&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "16.3",
                    name ="Éclair de Vainilla",
                    description = "Relleno de crema y cubierto con caramelo brillante",
                    imgURL = "https://thafd.bing.com/th/id/OIP._Fk2OvrKimxMxwrQPhy7JgAAAA?rs=1&pid=ImgDetMain"
                )
            )
        ),
        Restaurant(
            id = 17,
            name = "La Casa del Postre",
            description = "El rincón favorito para los amantes del dulce",
            imgURL = "https://www.pasteleriatradicion.com/wp-content/uploads/pasteleria-reformada-02-2-900x790_c.jpg",
            location = "Puerta Pedro Alarcón, 58 - Port St. Lucie, Rio / 32834",
            categories = listOf("Postres y Dulces"),
            menu = listOf(
                Dish(
                    id = "17.1",
                    name ="Chessecake de Maracuyá",
                    description = "Tarta suave con una acidez tropical deliciosa",
                    imgURL = "https://th.bing.com/th/id/R.c1f80baaa3b20323242b861ab8d7ac69?rik=9hSfJU9tzc1b%2bw&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "17.2",
                    name ="Tiramisú Clásico",
                    description = " Bizcocho con café, mascarpone y cacao en polvo",
                    imgURL = "https://th.bing.com/th/id/R.305695edac7a30a12f5dd0fabbf2d9be?rik=Osve%2fdBeCsybmA&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "17.3",
                    name ="Profiteroles",
                    description = "Rellenos de crema y bañados en chocolate oscuro",
                    imgURL = "https://thafd.bing.com/th/id/OIP.kPOzZHrXj2g3_br5duBDnQHaFj?rs=1&pid=ImgDetMain"
                )
            )
        ),
        Restaurant(
            id = 18,
            name = "Pastelería Magnolia",
            description = "Elegancia y sabor en postres artesanales",
            imgURL = "https://th.bing.com/th/id/R.29c96986f58977476565702b998b171f?rik=lYN6p7Wrk74UPA&riu=http%3a%2f%2fwww.veafotoaqui.com%2fimagenes_restaurantes%2f109-VITRINAINTERIORGRANDESP.jpg&ehk=XM%2bJ7np7yiJ2Mfmix5rturkRqpK1VcyAXGbkjfIbOYM%3d&risl=&pid=ImgRaw&r=0",
            location = "Prolongación Micaela Rubio 2 - Arcadia, Ast / 68210",
            categories = listOf("Postres y Dulces"),
            menu = listOf(
                Dish(
                    id = "18.1",
                    name ="Macarons",
                    description = " Coloridos y crujientes por fuera, suaves por dentro",
                    imgURL = "https://thafd.bing.com/th/id/OIP.B5W9wPHb0knKqkzxz1My7QHaFj?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "18.2",
                    name ="Rollo Suizo de Fresa",
                    description = "Bizcocho esponjoso relleno con crema y fresas naturales",
                    imgURL = "https://thafd.bing.com/th/id/OIP.cIs37vpAa4x4Z_q0x6SaFgHaE8?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "18.3",
                    name ="Tarta Ópera",
                    description = "Capas de almendra, crema de café y chocolate",
                    imgURL = "https://th.bing.com/th/id/R.ce2a0ef47fd6f5685f4f2d9c9ad71745?rik=88bLf83qtIVpwg&pid=ImgRaw&r=0"
                )
            )
        ),
        Restaurant(
            id = 19,
            name = "Tropical Shake",
            description = "Refrescantes batidos y smoothies",
            imgURL = "https://th.bing.com/th/id/R.dd9227c683f47400f119c429539246ab?rik=Z6n7%2fA3ut%2bK15Q&pid=ImgRaw&r=0",
            location = "Sección Jaime López s/n. - Winston-Salem, And / 70881",
            categories = listOf("Bebidas"),
            menu = listOf(
                Dish(
                    id = "19.1",
                    name ="Smoothie de Mango y Coco",
                    description = "Cremoso y dulce con sabor tropical",
                    imgURL = "https://d36fw6y2wq3bat.cloudfront.net/recipes/smoothie-de-mango-y-coco/900/smoothie-de-mango-y-coco_version_1645603675.jpg"
                ),
                Dish(
                    id = "19.2",
                    name ="Batido de Fresa y Avena",
                    description = " Energético y saciante, ideal para media mañana",
                    imgURL = "https://thafd.bing.com/th/id/OIP.9VPuMns1ShKRsRO6XqkqeAHaE8?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "19.3",
                    name ="Green Detox",
                    description = "Limpia y revitaliza con pepino, piña y jengibre",
                    imgURL = "https://thafd.bing.com/th/id/OIP.3VTSAyOhQKpJHNeNf-sU7AHaE8?rs=1&pid=ImgDetMain"
                )
            )
        ),
        Restaurant(
            id = 20,
            name = "Café Aurora",
            description = "Cafetería moderna",
            imgURL = "https://www.lovemydress.net/wp-content/uploads/2014/11/wpid322941-karen-millen-wedding-dress-london-34.jpg",
            location = "Parque Claudio Cruz s/n. - Castro Valley, Com / 36122",
            categories = listOf("Bebidas"),
            menu = listOf(
                Dish(
                    id = "20.1",
                    name ="Latte de Vainilla",
                    description = " Espresso suave con leche vaporizada y un toque dulce",
                    imgURL = "https://thafd.bing.com/th/id/OIP.-onsxiz4Fk4u4QLnKmIUKgHaLH?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "20.2",
                    name ="Té Chai Latte",
                    description = "Infusión de especias calientes con leche",
                    imgURL = "https://carorocco.com/wp-content/uploads/2021/03/Te-Chai-Latte-VERTICAL-1200x1600.jpg"
                ),
                Dish(
                    id = "20.3",
                    name ="Cold Brew con Naranja",
                    description = " Café frío infusionado con cítricos naturales",
                    imgURL = "https://thafd.bing.com/th/id/OIP.gRlpTOm8F4vavY6rf64gUwAAAA?rs=1&pid=ImgDetMain"
                )
            )
        ),
        Restaurant(
            id = 21,
            name = "Burbujas & Té",
            description = "Especialistas en té con burbujas",
            imgURL = "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/1c/95/2f/9b/republic-of-fremantle.jpg?w=1200&h=-1&s=1",
            location = "Vía Marcos 8 - Saginaw, Bal / 23166",
            categories = listOf("Bebidas"),
            menu = listOf(
                Dish(
                    id = "21.1",
                    name ="Bubble Tea de Tapioca",
                    description = "Té con leche y perlas dulces de tapioca",
                    imgURL = "https://th.bing.com/th/id/R.01ca7dd51ba25996a24c6d7a603d8327?rik=IIgbDZtMrthMeg&pid=ImgRaw&r=0"
                ),
                Dish(
                    id = "21.2",
                    name ="Matcha Latte Frío",
                    description = "Té verde japonés batido con leche fría",
                    imgURL = "https://thafd.bing.com/th/id/OIP.F6zAKdg_x0y4rwxosmgTjAHaE8?rs=1&pid=ImgDetMain"
                ),
                Dish(
                    id = "21.3",
                    name ="Té de Hibisco con Frutas",
                    description = "Bebida refrescante y afrutada, sin cafeína",
                    imgURL = "https://thafd.bing.com/th/id/OIP.d-90n8_FM46FbcDCACsxOgHaE7?rs=1&pid=ImgDetMain"
                )
            )
        )
    )

    private val _restaurantsByCategory = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val restaurantsByCategory: StateFlow<Map<String, List<Restaurant>>> = _restaurantsByCategory

    init {
        _restaurantsByCategory.value = groupRestaurantsByCategory(restaurants)
    }

    private fun groupRestaurantsByCategory(restaurants: List<Restaurant>): Map<String, List<Restaurant>> {
        return restaurants
            .flatMap { restaurant -> restaurant.categories.map { it to restaurant } }
            .groupBy({ it.first }, { it.second })
    }
}
