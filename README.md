# java-13-features

### Configurations to use "Preview" features in Java 13

Settings > Build, Execution, Deployment > Compiler > Java Compiler :

-- Project bytecode version: 13

-- Override compiler parameters per-module:

- Module: java-13-features
- Compilation Options: --enable-preview

Run/Debug Configurations > Application > [Choose Application] :

-- Build and Run > Modify Options > Add VM Options : --enable-preview
