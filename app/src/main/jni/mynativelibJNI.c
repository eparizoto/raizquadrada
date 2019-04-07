#include <jni.h>
#include <mynativelib.h>

JNIEXPORT jdouble JNICALL
Java_com_example_emersonparizoto_raizequadrado_MainActivity_quadrado(JNIEnv *env, jobject instance,
                                                                     jint number) {

    double d = 11;
    d = quadrado(number);

    return d;

}

JNIEXPORT jdouble JNICALL
Java_com_example_emersonparizoto_raizequadrado_MainActivity_raiz(JNIEnv *env, jobject instance,
                                                                 jint number) {

    double d = 22;
    d = raizQuadrada(number);

    return d;

}