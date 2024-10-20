package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;

/* loaded from: Projection.class */
final class Projection {
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    /* loaded from: Projection$Mesh.class */
    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public SubMesh getSubMesh(int i) {
            return this.subMeshes[i];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    /* loaded from: Projection$SubMesh.class */
    public static final class SubMesh {
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i, float[] fArr, float[] fArr2, int i2) {
            this.textureId = i;
            Assertions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i2;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, int i) {
        this(mesh, mesh, i);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f, int i, int i2, float f2, float f3, int i3) {
        Assertions.checkArgument(f > 0.0f);
        Assertions.checkArgument(i >= 1);
        Assertions.checkArgument(i2 >= 1);
        Assertions.checkArgument(f2 > 0.0f && f2 <= 180.0f);
        Assertions.checkArgument(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f4 = radians / i;
        float f5 = radians2 / i2;
        int i4 = i2 + 1;
        int i5 = ((i4 * 2) + 2) * i;
        float[] fArr = new float[i5 * 3];
        float[] fArr2 = new float[i5 * 2];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i) {
            float f6 = radians / 2.0f;
            float f7 = (i6 * f4) - f6;
            int i9 = i6 + 1;
            float f8 = (i9 * f4) - f6;
            int i10 = 0;
            float f9 = f4;
            while (i10 < i4) {
                int i11 = i8;
                int i12 = 0;
                int i13 = i7;
                float f10 = f8;
                int i14 = i10;
                int i15 = i11;
                while (i12 < 2) {
                    float f11 = i12 == 0 ? f7 : f10;
                    float f12 = i14 * f5;
                    float f13 = radians2 / 2.0f;
                    double d = f;
                    double d2 = (f12 + 3.1415927f) - f13;
                    double sin = Math.sin(d2);
                    double d3 = f11;
                    fArr[i13] = -((float) (sin * d * Math.cos(d3)));
                    fArr[i13 + 1] = (float) (d * Math.sin(d3));
                    int i16 = i13 + 3;
                    fArr[i13 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr2[i15] = f12 / radians2;
                    int i17 = i15 + 2;
                    fArr2[i15 + 1] = ((i6 + i12) * f9) / radians;
                    if ((i14 == 0 && i12 == 0) || (i14 == i2 && i12 == 1)) {
                        System.arraycopy(fArr, i13, fArr, i16, 3);
                        i13 += 6;
                        System.arraycopy(fArr2, i15, fArr2, i17, 2);
                        i15 += 4;
                    } else {
                        i13 = i16;
                        i15 = i17;
                    }
                    i12++;
                }
                int i18 = i14 + 1;
                int i19 = i15;
                i10 = i18;
                f8 = f10;
                i7 = i13;
                i8 = i19;
            }
            f4 = f9;
            i6 = i9;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr, fArr2, 1)), i3);
    }

    public static Projection createEquirectangular(int i) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i);
    }
}
