// Write your code here
abstract class Device {
    private String model;
    
    public Device(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}

interface CanTakePictures {
    public Double getMegapixels();
    public abstract String getModel();
}

interface CanPlayMusic {
    public String[] getMusicFormats();
    public abstract String getModel();
}

interface CanMakeCalls {
    public String getNetworkType();
    public abstract String getModel();
}

class Camera extends Device implements CanTakePictures {
    private Double megapixels;

    public Camera(String model, double megapixels) {
        super(model);
        this.megapixels = megapixels;
    }

    public Double getMegapixels() {
        return this.megapixels;
    }
}

class MusicPlayer extends Device implements CanPlayMusic {
    private String[] musicFormats;

    public MusicPlayer(String model, String[] formats) {
        super(model);
        this.musicFormats = formats;
    }
    
    public String[] getMusicFormats() {
        return this.musicFormats;
    }
}

class Featurephone extends Device implements CanMakeCalls {
    private String networkType;

    public Featurephone(String model, String net) {
        super(model);
        this.networkType = net;
    }

    public String getNetworkType() {
        return this.networkType;
    }
}

class Smartphone extends Device implements CanTakePictures, CanPlayMusic, CanMakeCalls {
    private String networkType;
    private String[] musicFormats;
    private Double megapixels;

    public Smartphone(String model, String net, double pixels, String[] formats) {
        super(model);
        this.networkType = net;
        this.musicFormats = formats;
        this.megapixels = pixels;
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

