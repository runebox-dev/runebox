package osrs

import io.runebox.updater.asm.Class2
import io.runebox.updater.mapper.IdentityMapper
import io.runebox.updater.util.predicateOf

class Client : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.name == "Client" }

}