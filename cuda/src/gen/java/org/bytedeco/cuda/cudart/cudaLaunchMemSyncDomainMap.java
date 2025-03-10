// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaLaunchMemSyncDomainMap extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaLaunchMemSyncDomainMap() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaLaunchMemSyncDomainMap(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaLaunchMemSyncDomainMap(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaLaunchMemSyncDomainMap position(long position) {
        return (cudaLaunchMemSyncDomainMap)super.position(position);
    }
    @Override public cudaLaunchMemSyncDomainMap getPointer(long i) {
        return new cudaLaunchMemSyncDomainMap((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned char") byte default_(); public native cudaLaunchMemSyncDomainMap default_(byte setter);
    public native @Cast("unsigned char") byte remote(); public native cudaLaunchMemSyncDomainMap remote(byte setter);
}
