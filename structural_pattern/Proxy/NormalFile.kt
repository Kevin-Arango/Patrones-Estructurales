package structural_pattern.Proxy

class NormalFile : IFile {
    override fun read(name: String) = println("Reading file: $name ")
}