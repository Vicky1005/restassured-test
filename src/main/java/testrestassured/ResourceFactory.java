package testrestassured;

public class ResourceFactory {

    public static Resource getResource1() {
        Resource resource = new Resource();
        resource.setId(1);
        resource.setName("cerulean");
        resource.setYear(2000);
        resource.setColor("#98B2D1");
        resource.setPantoneValue("15-4020");
        return resource;
    }

    public static Resource getResource2() {
        Resource resource = new Resource();
        resource.setId(2);
        resource.setName("fuchsia rose");
        resource.setYear(2001);
        resource.setColor("#C74375");
        resource.setPantoneValue("17-2031");
        return resource;
    }

    public static Resource getResource3() {
        Resource resource = new Resource();
        resource.setId(3);
        resource.setName("true red");
        resource.setYear(2002);
        resource.setColor("#BF1932");
        resource.setPantoneValue("19-1664");
        return resource;

    }

    public static Resource getResource4() {
        Resource resource = new Resource();
        resource.setId(4);
        resource.setName("aqua sky");
        resource.setYear(2003);
        resource.setColor("#7BC4C4");
        resource.setPantoneValue("14-4811");
        return resource;

    }

    public static Resource getResource5() {
        Resource resource = new Resource();
        resource.setId(5);
        resource.setName("tigerlily");
        resource.setYear(2004);
        resource.setColor("#E2583E");
        resource.setPantoneValue("17-1456");
        return resource;
    }

    public static Resource getResource6() {
        Resource resource = new Resource();
        resource.setId(6);
        resource.setName("blue turquoise");
        resource.setYear(2005);
        resource.setColor("#53B0AE");
        resource.setPantoneValue("15-5217");
        return resource;
    }


}
