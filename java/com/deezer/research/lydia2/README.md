#LYDIA2-CLD

The purpose of this module is to provide a java library which can be used to detect language using the [Chromium Language Detector](https://code.google.com/p/cld2/). To build this module, you need to use Facebook's [BUCK build tool](http://facebook.github.io/buck/setup/install.html). Please follow the steps to first install BUCK on your system. Once that is done, execute the following:

```
$ buck build //java/com/deezer/research/lydia2:lydia2-cld
```

This will generate the library, **lydia2-cld.jar** in **buck-out/gen/java/com/deezer/research/lydia2/**. 

The use of this library is simple. There is just one class, CLD which has a static method, **detectLanguage**. To detect the language of a given text segment, say **text**, call:

```
com.deezer.research.lydia2.CLD.detectLanguage(text)
```

Note that **text** must not contain non-UTF-8 characters, as they might cause the underlying C library to cause segmentation faults. 


