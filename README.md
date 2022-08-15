# Shared Test Module Sample

An example of creating a shared test module that can work in both `test` and `androidTest` (and in other modules).

In particular, `:library` has a `Messenger` interface. `:library-shared-test` implements a testable version called `FakeMessenger`, which is then used in unit and Android tests in both `:library` and `:app`.

Blog post forthcoming.