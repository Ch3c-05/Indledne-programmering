// Write your code here
interface Device {
    public String getModel();
}

interface CanTakePictures extends Device {
    public Double getMegapixels();
}

interface CanPlayMusic extends Device {
    public String[] getMusicFormats();
}

interface CanMakeCalls extends Device {
    public String getNetworkType();
}

class Camera implements CanTakePictures {
    private String model;
    private Double megapixels;

    public Camera(String model, double megapixels) {
        this.model = model;
        this.megapixels = megapixels;
    }

    public String getModel() {
        return this.model;
    }

    public Double getMegapixels() {
        return this.megapixels;
    }
}

class MusicPlayer implements CanPlayMusic {
    private String model;
    private String[] musicFormats;

    public MusicPlayer(String model, String[] formats) {
        this.model = model;
        this.musicFormats = formats;
    }

    public String getModel() {
        return this.model;
    }

    public String[] getMusicFormats() {
        return this.musicFormats;
    }
}

class Featurephone implements CanMakeCalls {
    private String model;
    private String networkType;

    public Featurephone(String model, String net) {
        this.model = model;
        this.networkType = net;
    }

    public String getModel() {
        return this.model;
    }

    public String getNetworkType() {
        return this.networkType;
    }
}

class Smartphone implements CanTakePictures, CanPlayMusic, CanMakeCalls {
    private String model;
    private String networkType;
    private String[] musicFormats;
    private Double megapixels;

    public Smartphone(String model, String net, double pixels, String[] formats) {
        this.model = model;
        this.networkType = net;
        this.musicFormats = formats;
        this.megapixels = pixels;
    }

    public String getModel() {
        return this.model;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public String[] getMusicFormats() {
        return this.musicFormats;
    }

    public Double getMegapixels() {
        return this.megapixels;
    }

}

