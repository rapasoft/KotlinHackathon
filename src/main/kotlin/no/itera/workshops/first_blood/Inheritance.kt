package no.itera.workshops.first_blood

import java.io.File

/**
 * Create a class hierarchy based on these rules:
 *
 * 1. TextFile and BinaryFile are FileResources
 * 2. BinaryFile is Streamable
 *
 */

class FileResource {
    fun toFile(): File {
        TODO()
    }
}

interface Streamable {
    fun openStream()

    fun closeStream()
}

class TextFile(content: String)

class BinaryFile(content: List<Byte>)