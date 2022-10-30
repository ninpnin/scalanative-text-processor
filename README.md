# Scala Native text processor

Process some text files with Scala and create native binaries to try out Scala Native.

Build and run _nativetext_ that uses an external library

```bash
mill nativetext.nativeLink
./out/nativetext/nativeLink.dest/out build.sc
```

Build and run _nativeargs_ that uses an external library

```bash
mill nativeargs.nativeLink
./out/nativeargs/nativeLink.dest/out --help
```