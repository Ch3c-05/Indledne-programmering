// Do not modify this class!  Add your class definitions below
class UglyPoint3D {
    public double x;
    public double y;
    public double z;

    public boolean equals(UglyPoint3D other) {
        return this == other;
    }
}

// Write your code here
class MehPoint3D extends UglyPoint3D {
    public MehPoint3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }     
}

class OkPoint3D extends MehPoint3D {
    public OkPoint3D(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public boolean equals(UglyPoint3D other) {
        if ((this.x == other.x) &&
            (this.y == other.y) &&
            (this.z == other.z)) {
            return true;
        } else {
            return false;
        }
    }
}

class GoodPoint3D extends OkPoint3D {
    public GoodPoint3D(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public boolean equals(UglyPoint3D other) {
        if (((Math.abs(this.x - other.x)) <= 0.0002) && 
            ((Math.abs(this.y - other.y)) <= 0.0002) &&
            ((Math.abs(this.z - other.z)) <= 0.0002)) {
            return true;
        } else {
            return false;
        }
    }    
}

class ExcellentPoint3D extends GoodPoint3D {
    public ExcellentPoint3D(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public boolean equals(UglyPoint3D other) {
        if (((Math.abs(this.x - other.x)) <= 0.0002) && 
            ((Math.abs(this.y - other.y)) <= 0.0002) &&
            ((Math.abs(this.z - other.z)) <= 0.0002)) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Point3D(" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}