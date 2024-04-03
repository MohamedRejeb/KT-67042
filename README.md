Minimal reproducible for: https://youtrack.jetbrains.com/issue/KT-67042/

Only reproduced when there are at least two targets in the project.

Failed Task: `Task :composeApp:compileCommonMainKotlinMetadata FAILED`
Error: `Unresolved reference 'convertRadiusToSigma'.`

Steps to reproduce:
1. Clone the project.
2. Run `./gradlew build`