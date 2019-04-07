# Sets the minimum version of CMake required to build your native library.
# This ensures that a certain set of CMake features is available to
# your build.

cmake_minimum_required(VERSION 3.4.1)


################## # Generating native library ##################

# Specifies a library name, specifies whether the library is STATIC or
# SHARED, and provides relative paths to the source code. You can
# define multiple libraries by adding multiple add.library() commands,
# and CMake builds them for you. When you build your app, Gradle
# automatically packages shared libraries with your APK.

add_library( # Specifies the name of the library.
             mynativelib

             # Sets the library as a shared library.
             #STATIC
             SHARED

             # Provides a relative path to your source file(s).
             src/main/cpp/mynativelib.cpp )

 # Specifies a path to native header files.
 include_directories(src/main/cpp/)

target_link_libraries(mynativelib)


################## # Generating libdvbpsi library ##################

project(libdvbpsi-1.3.0)

include_directories("src/main/libdvbpsi-1.3.0")

file(GLOB_RECURSE libdvbpsi_SRCS ./*.c*)

add_library( # Specifies the name of the library.
             mydvbpsilib

             # Sets the library as a shared library.
             #STATIC
             SHARED

             # Provides a relative path to your source file(s).
             ${libdvbpsi_SRCS})
             #src/main/libdvbpsi-1.3.0/src/*.c )

 # Specifies a path to native header files.
 include_directories(src/main/libdvbpsi-1.3.0/dvbpsi/*.h)

target_link_libraries(mydvbpsilib)


################## # Generating our JNI library ##################

add_library( # Specifies the name of the library.
             mynativelibJNI

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/jni/mynativelibJNI.c )

 # Specifies a path to native header files.
 include_directories(src/main/jni/)

target_link_libraries(mynativelibJNI mynativelib)
